package day4;
//https://fluvid.com/videos/detail/XLE5Zc8ZvXS6GdxGk#.YjLIjhmXyFw.link
import java.util.Scanner;

public class InherDemo2 {
	public static void main(String[] args) throws Exception{
		GoodPaintBrush brush=new GoodPaintBrush();
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the paint class qname...");
		String classname=scan.next();
		Paint paint=(Paint)Class.forName(classname).getConstructor().newInstance();
		
		brush.doPaint(paint);
	}
}

class BadPaintBrush{
	public void doPaint(int i) {
		if(i==1) {
			System.out.println("red colour...");
		}
		else if(i==2) {
			System.out.println("blue colour...");
		}
	}
}
/*
To eliminate the if-else-if conditions
1. Convert the condition to classes.
2. Group them under a hierarchy - INHERITANCE
3. Create a association between the using class and the 
hierarchial class
*/

class GoodPaintBrush{
	public void doPaint(Paint paint) {
		System.out.println(paint);
	}
}
class Paint{
	public Paint() {
		// TODO Auto-generated constructor stub
	}
}
class RedPaint extends Paint{
	public RedPaint() {
		// TODO Auto-generated constructor stub
	}
}
class BluePaint extends Paint{ 
	public BluePaint() {
		// TODO Auto-generated constructor stub
	}
}