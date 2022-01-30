package solid.liskov.before;

public class PaperBook extends  Book{

	@Override
	public String getName() {
		return "Paper book";
	}

	@Override
	public String getMaterial() {
		return "paper";
	}

}
