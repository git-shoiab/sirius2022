package iopack;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
//MARSHALLING AND UNMARSHALLING
//https://fluvid.com/videos/detail/G6x-YcDjDau5gLexO#.Yj2r6SfUeRc.link
public class IODemo6 {
	public static void main(String[] args) throws Exception{
		Laddu laddu=new Laddu();
		laddu.tasted=true;
		
		FileOutputStream fos=new FileOutputStream("myladdu.dat");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		oos.writeObject(laddu);
		
		
		laddu.size=laddu.size-5;
		
		System.out.println(laddu.size);
		
		laddu.size=laddu.size-2;
		
		System.out.println(laddu.size);
		
		FileInputStream fis=new FileInputStream("myladdu.dat");
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		Laddu laddu2=(Laddu)ois.readObject();
		
		System.out.println("old laddu..");
		System.out.println(laddu.size);
		System.out.println(laddu.tasted);
		
		System.out.println("new laddu..");
		System.out.println(laddu2.size);
		System.out.println(laddu2.tasted);
	}
}

class Laddu implements Serializable{
	boolean tasted=false;
	int size=10;
}
