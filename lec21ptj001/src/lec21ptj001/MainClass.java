package lec21ptj001;

public class MainClass {
	
	public static void main(String[] args) {
		
		InterfaceA ia = new ImplementClass();
		InterfaceB ib = new ImplementClass();
		InterfaceC ic = new ImplementClass();
		InterfaceD id = new ImplementClass();
		
		ia.funA();
		ib.funB();
		ic.funC();
		id.funD();
		
	}

}
