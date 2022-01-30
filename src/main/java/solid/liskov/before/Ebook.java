package solid.liskov.before;

public class Ebook  extends Book{

	@Override
	public String getName() {
		return "Ebook";
	}

	@Override
	public String getMaterial() {
		//Not applicable
		throw new RuntimeException("Ebook is on the Internet, has no material");
	}

}
