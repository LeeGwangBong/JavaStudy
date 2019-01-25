package lec14ptj001;

public class MainClass {

	public static void main(String[] args) {
		
		ObjectClass obj1 = new ObjectClass();
		ObjectClass obj2 = new ObjectClass();
		ObjectClass obj3 = new ObjectClass();
		

		obj1.getInfo();
		System.out.println("obj----->"+obj1);
		obj1=null; //레퍼런스 X
		System.out.println("obj----->"+obj1);
		obj2.getInfo();
		
	}
}
