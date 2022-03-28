package iopack;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
//https://fluvid.com/videos/detail/5Ad-5C1QMBFVGwLxG#.YkF8eoO0Au4.link
public class ClassLockDemo {
public static void main(String[] args) {
	ExecutorService es=Executors.newFixedThreadPool(2);
	House house=new House();
	House house2=new House();
	es.execute(()->{
		Thread.currentThread().setName("somu");
		synchronized(House.class) {
		house.getRR().useRestRoom();
		}
	});
	
	es.execute(()->{
		Thread.currentThread().setName("ramu");
		synchronized(House.class) {
			house2.getRR().useRestRoom();
		}
	});
	es.shutdown();
}
}

class House{
	static RestRoom rr=new RestRoom();
	public RestRoom getRR() {
		return rr;
	}
}

class RestRoom{
	public void useRestRoom() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+"  is using the toilet....");
		try {Thread.sleep(5000);}catch(Exception e) {}
		System.out.println(name+".. comes out of toilet...");
	}
}