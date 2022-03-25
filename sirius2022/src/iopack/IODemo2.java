package iopack;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IODemo2 {
	public static void main(String[] args)throws Exception {
		FileInputStream fis=new FileInputStream("data.txt");
		FileOutputStream fos=new FileOutputStream("copy.txt");
		
		int n=0;
		byte b[]=new byte[4];
		while((n=fis.read(b))!=-1) {
			fos.write(b,0,n);
		}
		
		
	}
}
