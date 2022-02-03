package solid.di.after;

public class TablePhone implements Phone{

	@Override
	public void call(String destNumber) {
		System.out.print("Table phone is calling ...");
	}

}
