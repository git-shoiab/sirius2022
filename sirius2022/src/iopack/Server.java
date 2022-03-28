package iopack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	ServerSocket ss;Socket s;
	PrintWriter out;BufferedReader in,socketin;
	public Server() {
		try {
			ss=new ServerSocket(2000);
			System.out.println("Server Ready...");
			while(true) {
				s=ss.accept();
				out=new PrintWriter(s.getOutputStream(),true);
				in=new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Please enter a message to client...:");
				String msgToClient=in.readLine();
				out.println(msgToClient);
				
				socketin=new BufferedReader(new InputStreamReader(s.getInputStream()));
				String msgFromClient=socketin.readLine();
				System.out.println("Message From Client..:"+msgFromClient);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new Server();
	}
}
