package solid.di.after;

public class SmartPhone implements Phone {
	
	@Override
	public void call(String destNumber) {
		System.out.print("SmartPhone is calling...");
	}

}
