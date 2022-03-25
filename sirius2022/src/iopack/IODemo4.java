package iopack;
//https://fluvid.com/videos/detail/-KRkYhGkG6HEzoo3p#.Yj2Y11_foQM.link
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.net.URL;
import java.net.URLConnection;

public class IODemo4 {
	public static void main(String[] args)throws Exception {
		URL url=new URL("https://www.google.com/index.html");
		URLConnection urlcon=url.openConnection();
		try(
		FileReader fis=new FileReader("data.txt");
		FileWriter fos=new FileWriter("copy.txt");
				){
		int n=0;
		char b[]=new char[4];
		while((n=fis.read(b))!=-1) {
			fos.write(b,0,n);
		}
		
		}catch(Exception e) {
			
		}
	}
}


