package lec12ptj001;

public class Grandeur {
	
	public String color;
	public String gear;
	public int price;
	
	public Grandeur()    //������ - Ŭ���� �̸��� ������ �޼ҵ�
	{
		System.out.println("Grandeur constructor");
	}
	
	public void run()
	{
		System.out.println("--run--");
	}
	
	public void stop()
	{
		System.out.println("--stop--");
	}
	
	public void info()
	{
		System.out.println("----------Info----------");
		System.out.println("--color  : "+color);
		System.out.println("--gear   : "+gear);
		System.out.println("--price  : "+price);
	}

}
