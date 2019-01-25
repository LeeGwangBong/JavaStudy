package lec19ptj001;

public class ChildClass extends ParentClass{
	
	public ChildClass() {
		System.out.println("ChildClass constructor");
	}
	@Override
	public void makeJJajang() {
		System.out.println("-- more delicious makeJJajang() --");
	}

}
