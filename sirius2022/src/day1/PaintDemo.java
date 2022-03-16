package day1;

public class PaintDemo {
	public static void main(String[] args) {
		
		PaintBrush badBrush=new PaintBrush();
		badBrush.doPaint(1);
		badBrush.doPaint(3);
		
		GoodBrush goodBrush=new GoodBrush();
		goodBrush.doPaint(new RedPaint());
		goodBrush.doPaint(new VioletPaint());
		
	}
	public class A{}
	private class B{}
	protected class C{}
	static class D{}
	//friend class E{}
}

class PaintBrush{
	public void doPaint(int n) {
		if(n==1) {
			System.out.println("red colour...");
		}
		else if(n==2) {
			System.out.println("green colour...");
		}
		else if(n==3) {
			System.out.println("blue colour...");
		}
	}
}

class GoodBrush{
	public void doPaint(Paint p) {
		System.out.println(p);
	}
}
abstract class Paint{}
class RedPaint extends Paint{}
class BluePaint extends Paint{}
class GreenPaint extends Paint{}
class VioletPaint extends Paint{}