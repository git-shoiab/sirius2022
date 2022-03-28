package iopack;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	ServerSocket ss;Socket s;
	public Server() {
		try {
			ss=new ServerSocket(2000);
			System.out.println("Server Ready...");
			while(true) {
				s=ss.accept();
				System.out.println(s);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new Server();
	}
}
