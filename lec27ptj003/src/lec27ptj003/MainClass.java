package lec27ptj003;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class MainClass {
	
	public static void main(String[] args) {
		//บนป็
		InputStream inputStream = null;
		OutputStream outputStream = null;
		
		try {
			inputStream = new FileInputStream("C:\\Java\\Project\\hello.txt");
			outputStream = new FileOutputStream("C:\\Java\\Project\\helloCopy.txt");
			
			byte[] arr = new byte[3];
			
			while(true) {
				int len = inputStream.read(arr);
				if(len ==-1) break;
				outputStream.write(arr,0,len);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(inputStream != null) {
				try {
					inputStream.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
				
				if(outputStream != null) {
					try {
						inputStream.close();
					}catch(Exception e) {
						e.printStackTrace();
					}
				
			}
		}
	}
	}
	
}
