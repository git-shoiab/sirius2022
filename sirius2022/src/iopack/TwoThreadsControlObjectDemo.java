package iopack;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TwoThreadsControlObjectDemo {
	public static void main(String[] args) {
		ReservationCounter central=new ReservationCounter();
		
		ExecutorService es=Executors.newFixedThreadPool(2);
		
		es.execute(()->{
			Thread.currentThread().setName("somu");
			central.bookTicket(1000);
			central.giveChange();
		});
		
		es.execute(()->{
			Thread.currentThread().setName("ramu");
			central.bookTicket(500);
			central.giveChange();
		});
		es.shutdown();
	}
}

class ReservationCounter{
	int amt;
	public void bookTicket(int amt) {
		String name=Thread.currentThread().getName();
		this.amt=amt;
		System.out.println(name+"..booking the ticket...for..:"+amt);
	}
	
	public void giveChange() {
		String name=Thread.currentThread().getName();
		amt=amt-100;
		System.out.println(name+"..change given...for..:"+amt);
	}
}