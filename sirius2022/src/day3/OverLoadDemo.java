package day3;

public class OverLoadDemo {
	public static void main(String[] args) {
		OverLoadDemo obj=new OverLoadDemo();
		obj.met(10,"aa");
		obj.met(new Temp());
	}
	
	void met() {
		System.out.println("empty method called...");
	}
	
	void met(int i) {
		System.out.println("method with param called...");
	}
	
	void met(String s,int i) {
		System.out.println("method with s and i param");
	}
	int met(int i,String str) {
		System.out.println("method with i and s called...");
		return 1;
	}
	void met(Temp temp) {
		System.out.println("temp obj method called...");
	}
	
}

class Temp{}