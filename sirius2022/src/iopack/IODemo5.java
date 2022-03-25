package iopack;
import java.io.BufferedInputStream;
//https://fluvid.com/videos/detail/-KRkYhGkG6HEzoo3p#.Yj2Y11_foQM.link
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.net.URL;
import java.net.URLConnection;

public class IODemo5 {
	public static void main(String[] args)throws Exception {
		URL url=new URL("https://www.google.com/index.html");
		URLConnection urlcon=url.openConnection();
		//FileInputStream fis=new FileInputStream();//urlcon.getInputStream());
		
		BufferedInputStream fis=new BufferedInputStream(urlcon.getInputStream());
		FileOutputStream fos=new FileOutputStream("copy.html");
		
		int n=0;
		byte b[]=new byte[4];
		while((n=fis.read(b))!=-1) {
			fos.write(b,0,n);
		}
		
	}
}


