package lec07ptj001;

import java.util.Scanner;

public class MainClass {
public static void main(String[] args) {
	
	
	String [] name= {"박찬호","류현진","이병규","이대호","추신수"};
	int[] score=new int [5];
	Scanner scanner = new Scanner(System.in);
	
	System.out.printf("%s 의 점수를 입력하세요.\n",name[0]);
	score[0]=scanner.nextInt();
	
	System.out.printf("%s 의 점수를 입력하세요.\n",name[1]);
	score[1]=scanner.nextInt();
	
	System.out.printf("%s 의 점수를 입력하세요.\n",name[2]);
	score[2]=scanner.nextInt();
	
	System.out.printf("%s 의 점수를 입력하세요.\n",name[3]);
	score[3]=scanner.nextInt();
	
	System.out.printf("%s 의 점수를 입력하세요.\n",name[4]);
	score[4]=scanner.nextInt();
	
	System.out.printf("%s 점수 :  %.2f\n",name[0],(double)score[0]);
	System.out.printf("%s 점수 :  %.2f\n",name[1],(double)score[1]);
	System.out.printf("%s 점수 :  %.2f\n",name[2],(double)score[2]);
	System.out.printf("%s 점수 :  %.2f\n",name[3],(double)score[3]);
	System.out.printf("%s 점수 :  %.2f\n",name[4],(double)score[4]);
	
	System.out.println("--------------------------------------------------------------");
	double ave = (double)(score[0]+score[1]+score[2]+score[3]+score[4])/5;
	System.out.printf("평점 :      %.2f",ave);
	
	scanner.close();
	
}
}
