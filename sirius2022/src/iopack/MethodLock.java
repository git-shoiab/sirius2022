package iopack;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MethodLock {
	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(3);
		RationShop shop=new RationShop();
		es.execute(()->{
			Thread.currentThread().setName("somu");
		//	synchronized(shop) {
			shop.billing();
			shop.foodCounter();
		//	}
		});
		
		es.execute(()->{
			Thread.currentThread().setName("ramu");
		//	synchronized(shop) {
			shop.water();
		//	}
		});
		
		es.execute(()->{
			Thread.currentThread().setName("rahim");		
			//synchronized(shop) {
			shop.billing();
			shop.water();
			shop.foodCounter();
			//}
			
		});
		es.shutdown();
	}
}

class RationShop{
	synchronized public void billing() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+"  is using the billing counter....");
		try {Thread.sleep(3000);}catch(Exception e) {}
		System.out.println(name+".. comes out of billing counter...");
	}
	
	synchronized public void foodCounter() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+"  is using the food counter....");
		try {Thread.sleep(3000);}catch(Exception e) {}
		System.out.println(name+".. comes out of food counter...");
	}
	
	public void water() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+"  is using the water....");
		try {Thread.sleep(1000);}catch(Exception e) {}
		System.out.println(name+".. comes out of drinking water...");
	}
}