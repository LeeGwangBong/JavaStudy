package lec12ptj001;

public class Bicycle {
	
	public String color;
	public int price;
	
	public Bicycle()//생성자 1
	{
		System.out.println(" Bicycle constructotr");
	}
	public Bicycle(String c,int p)//생성자 2
	{
		System.out.println(" Bicycle constructotr-2");
		color=c;
		price=p;
	}
	
	public void run() //메소드 정의부
	{
		System.out.println("run"); //메소드 정의부
	}
	
	public void stop()
	{
		System.out.println("stop");
	}
	
	public void info()
	{
		System.out.println("color : "+color);
		System.out.println("color : "+price);
	}

}
