package lec09ptj001;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		if(num1<num2)
		{
			System.out.println("num1 ��  num2 ���� �۴�.");
		}
		else if(num1>num2)
		{
			System.out.println("num1 ��  num2 ���� ũ��.");
		}
		else
		{
			System.out.println("num1 ��  num2 �� ����.");
		}
	
	System.out.println("������ �Է��ϼ��� :  ");
	Scanner s =new Scanner(System.in);
	int score = s.nextInt();
	
	switch(score) {
	   case 100:
	   case 90:
	     System.out.println("��");
	   break;
	
	    case 80:
		  System.out.println("��");
		break;
	
	    case 70:
		  System.out.println("��");
		break;
		
		default:
			System.out.println("Try Again!!");
		break;
		
	}
	s.close();
	}

}
