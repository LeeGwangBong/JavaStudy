package lec15ptj001;

public class ObjectEx {

	
	public int x;
	public int y;
	public ObjectEx() {
		System.out.println("  -- Defalt -- ");
	}
	
	public ObjectEx(String n, int[] iArr) {
		System.out.println(" -- ObjectEx() -- ");
		System.out.println("n : "+n);
		System.out.println("iArr : "+iArr.length);
	}
	
	public ObjectEx(int x, int y) {
		
		this.x=x;
		this.y=y;
		
	}
	
	public void getInfo(){
		System.out.println(" -- getInfo --");
		System.out.println("x-->"+x);
		System.out.println("y-->"+y);
	}
	
	protected void finalize() throws Throwable{
		System.out.println( "-- finalize()  method -- ");
	
	super.finalize();
	}
}
