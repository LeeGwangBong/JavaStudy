package lec08ptj001;

import java.util.Arrays;

public class MainClass {
public static void main(String[] args) {
	
	int [] arr1= {10,20,30,40,50,60};
	int [] arr2= null;
    int [] arr3= null;
    
    System.out.println("arr1.length : "+arr1.length);
    System.out.println("arr1              :"+Arrays.toString(arr1));
    arr3=Arrays.copyOf(arr1, arr1.length);
    System.out.println("arr3              :"+Arrays.toString(arr3));
    arr2=arr1;
    System.out.println("arr1              :"+arr1);
    System.out.println("arr1              :"+arr2);
    System.out.println("arr1              :"+arr3);
    
    int[][] arrMul = new int [3][2];
    arrMul[0][0]=10;
    arrMul[0][1]= 10;
    arrMul[1][0]=20;
    arrMul[1][1]=20;
    arrMul[2][0]=30;
    arrMul[2][1]=40;
     System.out.println("arrMul[0]  :"+Arrays.toString(arrMul[0]));
     System.out.println("arrMul[1]  :"+Arrays.toString(arrMul[1]));
     System.out.println("arrMul[2]  :"+Arrays.toString(arrMul[2]));
}
}
