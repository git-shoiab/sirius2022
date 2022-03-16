package day3;
//https://fluvid.com/videos/detail/KR9rGt6gBEiapXXp6#.YjGpykB4NqM.link
public class ConsDemo1 {
	private ConsDemo1(){
		System.out.println("empty cons called...");
	}
	private ConsDemo1(int i){
		System.out.println("parameter cons called..."+i);
	}
	
	public static void main(String[] args) {
		 new ConsDemo1();
		 new ConsDemo1(10);
		A obj=new A(100);
		obj.printN();
	}
}
class A{
	int n=10;
	public A(int n) {
		this.n=n;
	}
	
	void printN() {
		System.out.println(n);
	}
}