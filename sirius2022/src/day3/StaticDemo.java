package day3;
//https://fluvid.com/videos/detail/37jwQhOYk4Iy1_Rxg#.YjGxsPNAn4Q.link
public class StaticDemo {
	public StaticDemo() {
		System.out.println("cons called....");
	}
	static {
		System.out.println("static block called...");
	}
	public static void main(String[] args) {
		StaticDemo obj=new StaticDemo();
//		obj.met1();
		obj.met2();
		StaticDemo.met();StaticDemo.met();
		StaticDemo.met2();
	}
	void met1() {
		
	}
	static void met() {
		System.out.println("static met called...");
	}
	static void met2() {
		System.out.println("static met2 called...");
	}
}
