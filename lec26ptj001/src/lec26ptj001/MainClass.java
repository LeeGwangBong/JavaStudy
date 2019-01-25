package lec26ptj001;

public class MainClass {
	
	public static void main(String[] args) {
		
		int i = 10;
		int j = 0;
		int r = 0;
		
		System.out.println("Exception BEFORE");
		
		try {
			r = i / j;  //예외가 발생할만한 구문
		} catch( Exception e) {
			e.printStackTrace();
			String msg = e.getMessage();
			System.out.println("Exception: "+msg);
		}
		
		System.out.println("Exception AFTER");
		
	}

}
