package lec07ptj001;

import java.util.Scanner;

public class MainClass {
public static void main(String[] args) {
	
	
	String [] name= {"����ȣ","������","�̺���","�̴�ȣ","�߽ż�"};
	int[] score=new int [5];
	Scanner scanner = new Scanner(System.in);
	
	System.out.printf("%s �� ������ �Է��ϼ���.\n",name[0]);
	score[0]=scanner.nextInt();
	
	System.out.printf("%s �� ������ �Է��ϼ���.\n",name[1]);
	score[1]=scanner.nextInt();
	
	System.out.printf("%s �� ������ �Է��ϼ���.\n",name[2]);
	score[2]=scanner.nextInt();
	
	System.out.printf("%s �� ������ �Է��ϼ���.\n",name[3]);
	score[3]=scanner.nextInt();
	
	System.out.printf("%s �� ������ �Է��ϼ���.\n",name[4]);
	score[4]=scanner.nextInt();
	
	System.out.printf("%s ���� :  %.2f\n",name[0],(double)score[0]);
	System.out.printf("%s ���� :  %.2f\n",name[1],(double)score[1]);
	System.out.printf("%s ���� :  %.2f\n",name[2],(double)score[2]);
	System.out.printf("%s ���� :  %.2f\n",name[3],(double)score[3]);
	System.out.printf("%s ���� :  %.2f\n",name[4],(double)score[4]);
	
	System.out.println("--------------------------------------------------------------");
	double ave = (double)(score[0]+score[1]+score[2]+score[3]+score[4])/5;
	System.out.printf("���� :      %.2f",ave);
	
	scanner.close();
	
}
}