package lec13ptj001;

public class ChildClass {
	public String name;
	public String gender;
	public int age;
	
	
	
	public ChildClass()
	{
		System.out.println("--ChildClass constructor--");
	}
	
	public void getInfo()
	{
		System.out.println("-- getInfo() Start --");
		
		System.out.println("name : "+name);
		System.out.println("gender : "+gender);
		System.out.println("age : "+age);
	}
	
	public void setInfo(String n,String g,int a)
	{
		System.out.println("-- setInfo() --");
		name=n;
		gender=g;
		age=a;
	}
	
	private void mySecrete() //private클래스 내부에서만 사용가능
	{
		System.out.println("-- mySecrete() --");
	}

}
