package solid.liskov.after;

public class PaperBook implements Book, PrinteBook{

	@Override
	public String getName() {
		return "Paper book";
	}

	@Override
	public String getMaterial() {
		return "paper";
	}

}
