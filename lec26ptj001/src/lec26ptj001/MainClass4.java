package lec26ptj001;

public class MainClass4 {

	public static void main(String[] args) {
		
		MainClass4 mainClass4 = new MainClass4();
		
		try {
			mainClass4.firstMethod();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	public  void firstMethod() throws Exception{
		secondMethod();
	}
	public  void secondMethod() throws Exception{
		thirdMethod();
	}
	public  void thirdMethod() throws Exception{
		System.out.println("10 / 0 = "+(10/0));
	}
}
