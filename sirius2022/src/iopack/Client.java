package iopack;

import java.net.Socket;

public class Client {
	Socket s;
	public Client() {
		try {
			s=new Socket("localhost",2000);
			System.out.println(s);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new Client();
	}
}
