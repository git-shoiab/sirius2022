package iopack;
//https://fluvid.com/videos/detail/M-AKQTqy_YH4YLX5Q#.Yj2N7j6QgSc.link
import java.io.FileInputStream;

public class IODemo {
	public static void main(String[] args) throws Exception{
		FileInputStream fis=new FileInputStream("data.txt");
		
		System.out.println(fis.available());
		
			
//		while(fis.available()!=0) {
//			System.out.println((char)fis.read());
//		}
//		int n=0;
//		
//		while((n=fis.read())!=-1) {
//			System.out.println((char)n);
//		}
		
//		byte b[]=new byte[fis.available()];
//		
//		fis.read(b);
//		
//		String s=new String(b);
//		System.out.println(s);
		
		int n=0;
		byte b[]=new byte[4];
		while((n=fis.read(b))!=-1) {
			String s=new String(b,0,n);
			System.out.println(s);
		}
	}
}
