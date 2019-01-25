package lec19ptj001;

public class FirstChildClass extends ParentClass{
	
	int openYear = 2001;
	
	public FirstChildClass() {
		System.out.println("FisrstChildClass constructor");
	}
	
	@Override
	public void makeJJajang() {
		System.out.println("-- FisrstChild makeJJajang() --");
	}
	
	public void getOpenYear() {
		System.out.println("ChildClass open : "+this.openYear);
		System.out.println("ParentClass open : "+super.openYear);
	}

}
