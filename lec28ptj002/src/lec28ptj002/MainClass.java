package lec28ptj002;

import java.io.IOException;
import java.net.Socket;

public class MainClass {
	//클라이언트
	public static void main(String[] args) {
		
		Socket socket = null;
		
		try {
			socket = new Socket("localhost",9000);//127.0.0.1
			System.out.println("서버연결!");
			System.out.println("Socket : "+socket);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
