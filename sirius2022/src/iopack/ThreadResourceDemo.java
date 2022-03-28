package iopack;
//https://fluvid.com/videos/detail/M-AKQTqn62t4YAVBO#.YkFHmDT1ls0.link
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadResourceDemo {
	public static void main(String[] args) {
		Laptop l1=new Laptop();
		Laptop l2=new Laptop();
		
		ExecutorService es=Executors.newFixedThreadPool(2);
		
		es.execute(()->{
			Thread.currentThread().setName("somu");
			LaptopStorageRack.setLaptop(l2);
			Laptop laptop=LaptopStorageRack.getLaptop();
			System.out.println(laptop);
		});
		
		es.execute(()->{
			Thread.currentThread().setName("ramu");
			LaptopStorageRack.setLaptop(l1);
			Laptop laptop=LaptopStorageRack.getLaptop();
			System.out.println(laptop);
		});
		es.shutdown();
}

}
class Laptop{
	
}

class LaptopStorageRack{
	private static ThreadLocal<Laptop> tLocal=new ThreadLocal<Laptop>();
	
	public static void setLaptop(Laptop l1) {
		Laptop laptop=tLocal.get();
		if(laptop!=null) {
			System.out.println("Laptop is alrady their in your name...");
		}
		else {
			String name=Thread.currentThread().getName();
			
			tLocal.set(l1);
			System.out.println("storage of laptop for..:"+name+"..confirmed..");
		}
	}
	
	public static Laptop getLaptop() {
		Laptop laptop=tLocal.get();
		if(laptop!=null) {
			String name=Thread.currentThread().getName();
			System.out.println(name+"..please take your laptop..");
			return laptop;
		}
		else {
			String name=Thread.currentThread().getName();
			System.out.println(name+"..dont have a laptop...first store it...");
			return null;
		}
	}
}