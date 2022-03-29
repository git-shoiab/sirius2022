package iopack;
//https://fluvid.com/videos/detail/xLOkKc_7rKS1rq4aG#.YkKLc2QZ6Dw.link
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {
	public static void main(String[] args)throws Exception {
		ExecutorService es=Executors.newFixedThreadPool(1);
		
		Future<String> future= es.submit(new MyCallable());
		
		System.out.println("called.....");
		
		//System.out.println("Result..:"+future.get());
		
		System.out.println("waiting for the result...");
	}
}

class MyCallable implements Callable<String>{
	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("method called...");
		try {Thread.sleep(5000);}catch(Exception e) {}
		System.out.println("Processing done..");
		return "thread value returned";
	}
}