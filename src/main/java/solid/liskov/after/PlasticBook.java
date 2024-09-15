package solid.liskov.after;

public class PlasticBook implements Book, PrintedBook {

	@Override
	public String getName() {
		return "Plastic book";
	}

	@Override
	public String getMaterial() {
		return "Plastic";
	}

}
