package iopack;
//https://fluvid.com/videos/detail/R_4m9Sv-dniMpgR5A#.YkKEzDWhB8A.link
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//DEADLOCK - CIRCULAR DEPENDENCY BETWEEN TWO SYNCHRONIZED BLOCKS CAUSES DEADLOCK
public class DeadLock {
	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(2);
		Crane crane=new Crane();
		Frog frog=new Frog();
		
		es.execute(()->{
			Thread.currentThread().setName("crane");
			crane.eat(frog);
		});
		
		es.execute(()->{
			Thread.currentThread().setName("frog");
			frog.escape(crane);
		});
		es.shutdown();
	}
}

class Crane{
	synchronized public void eat(Frog f) {
		String name=Thread.currentThread().getName();
		System.out.println(name+" going to eat the frog...");
		f.leaveNeck();
	}
	synchronized public void spitFrog() {
		
	}
}

class Frog{
	synchronized public void escape(Crane c) {
		c.spitFrog();
	}
	synchronized public void leaveNeck() {
		
	}
}