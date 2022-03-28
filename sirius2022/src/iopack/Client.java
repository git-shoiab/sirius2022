package iopack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
//https://fluvid.com/videos/detail/P5OY2TPkxMFgre-v_#.YkE7rJEHSn8.link
public class Client {
	Socket s;BufferedReader in,keyin;PrintWriter out;
	public Client() {
		try {
			while(true) {
			s=new Socket("localhost",2000);
			
			in=new BufferedReader(new InputStreamReader(s.getInputStream()));
			String msgFromServer=in.readLine();
			System.out.println("Message From Server..:"+msgFromServer);
			
			out=new PrintWriter(s.getOutputStream(),true);
			keyin=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Pls enter message for server..:");
			String msgToServer=keyin.readLine();
			out.println(msgToServer);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new Client();
	}
}
