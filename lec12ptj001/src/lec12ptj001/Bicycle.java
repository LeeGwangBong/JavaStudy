package lec12ptj001;

public class Bicycle {
	
	public String color;
	public int price;
	
	public Bicycle()//������ 1
	{
		System.out.println(" Bicycle constructotr");
	}
	public Bicycle(String c,int p)//������ 2
	{
		System.out.println(" Bicycle constructotr-2");
		color=c;
		price=p;
	}
	
	public void run() //�޼ҵ� ���Ǻ�
	{
		System.out.println("run"); //�޼ҵ� ���Ǻ�
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
