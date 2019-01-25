package lec21ptj001;

public class ImplementClass implements InterfaceA, InterfaceB, InterfaceC, InterfaceD{
	
	public ImplementClass() {
		System.out.println("ImplementClass constructor");
	}

	@Override
	public void funD() {
		System.out.println(" -- funD --");
		
	}

	@Override
	public void funC() {
		System.out.println(" -- funC --");
		
	}

	@Override
	public void funB() {
		System.out.println(" -- funB --");
		
	}

	@Override
	public void funA() {
		System.out.println(" -- funA --");
		
	}

}
