package lec19ptj001;

public class MainClass {
	
	public static void main(String[] args) {
		
		ParentClass[] pArr = new ParentClass[2];
		
		
		FirstChildClass child1 = new FirstChildClass();
		ParentClass child2 = new SecondChildClass();
		

		pArr[1] = child2;
		
		child1.getOpenYear();
		
	}

}
