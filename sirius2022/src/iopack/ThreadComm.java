package iopack;
//https://fluvid.com/videos/detail/ZEn3MT8Ee3T9DEEB_#.YkGYWoC0ppk.link
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadComm {
	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(2);
		Gun bofors=new Gun();
		es.execute(()->{
			Thread.currentThread().setName("somu");
			for(int i=0;i<5;i++) {
				bofors.fill();
			}
		});
		
		es.execute(()->{
			Thread.currentThread().setName("ramu");
			for(int i=0;i<5;i++) {
				bofors.shoot();
			}
		});
		es.shutdown();
	}
}

class Gun{
	boolean flag=false;
	synchronized public void fill() {
		if(flag) {
			try {wait();}catch(Exception e) {}
		}
		System.out.println("gun is filled...");
		flag=true;
		notify();
	}
	
	synchronized public void shoot() {
		if(!flag) {
			try {wait();}catch(Exception e) {}
		}
		System.out.println("shoot the gun...");
		flag=false;
		notify();
	}
}