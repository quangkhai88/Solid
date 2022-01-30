package solid.liskov.before;

public class PlasticBook extends Book{

	@Override
	public String getName() {
		return "Plastic book";
	}

	@Override
	public String getMaterial() {
		return "Plastic";
	}

}
