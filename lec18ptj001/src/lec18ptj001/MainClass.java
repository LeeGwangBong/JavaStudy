package lec18ptj001;

public class MainClass {
	
	public static void main(String[] args) {
		
		ChildClass child1 = new ChildClass();
		child1.childFun();
		child1.parentFun();
		//child1.privateFun(); private는 상속을 받을 수 없다.
		
	}

}
