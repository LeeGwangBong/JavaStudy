package lec09ptj001;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		if(num1<num2)
		{
			System.out.println("num1 은  num2 보다 작다.");
		}
		else if(num1>num2)
		{
			System.out.println("num1 은  num2 보다 크다.");
		}
		else
		{
			System.out.println("num1 은  num2 와 같다.");
		}
	
	System.out.println("점수를 입력하세요 :  ");
	Scanner s =new Scanner(System.in);
	int score = s.nextInt();
	
	switch(score) {
	   case 100:
	   case 90:
	     System.out.println("수");
	   break;
	
	    case 80:
		  System.out.println("우");
		break;
	
	    case 70:
		  System.out.println("미");
		break;
		
		default:
			System.out.println("Try Again!!");
		break;
		
	}
	s.close();
	}

}
