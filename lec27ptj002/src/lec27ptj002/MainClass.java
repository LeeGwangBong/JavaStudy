package lec27ptj002;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class MainClass {
	
	public static void main(String[] args) {
		
	//write
		/*	OutputStream outputStream = null;
		try {
			
			outputStream = new FileOutputStream("C:\\Java\\Project\\hello.txt");
			String data = "Hello java fucking Shit";
			byte[] arr = data.getBytes();
			
			try {
				outputStream.write(arr);
			}catch(IOException e) {
				e.printStackTrace();
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				if(outputStream != null) outputStream.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}*/
		
		//write()
		OutputStream outputStream = null;
		try {
			
			outputStream = new FileOutputStream("C:\\Java\\Project\\hello.txt");
			String data = "Hello java world!!";
			byte[] arr = data.getBytes();
			try {
				outputStream.write(arr, 0, 5);
			}catch (IOException e) {
				e.printStackTrace();
			}
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				if(outputStream != null) outputStream.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
	
	
	}
	}
}
