package iopack;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class IODemo3 {
	public static void main(String[] args)throws Exception {
		FileReader fis=new FileReader("data.txt");
		FileWriter fos=new FileWriter("copy.txt");
		
		int n=0;
		char b[]=new char[4];
		while((n=fis.read(b))!=-1) {
			fos.write(b,0,n);
		}
		
		fos.close();
	}
}
