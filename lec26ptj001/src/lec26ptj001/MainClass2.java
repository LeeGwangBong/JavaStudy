package lec26ptj001;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass2 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int i,j;
		ArrayList<String> list = null;
		int[] iArr = {0,1,2,3,4};
		
		System.out.println("Exception Before");
		
		try {
			System.out.println("input i : ");
			i = s.nextInt();
			System.out.println("input j : ");
			j= s.nextInt();
			
			System.out.println(" i / j ="+(i/j));
			
			for(int k =0; k<6; k++) {
				System.out.println("iArr ["+k+"] : " + iArr[k]);
			}
			
			System.out.println("list.size() : "+list.size());
		}catch(InputMismatchException e) {
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Exception After");
	}

}
