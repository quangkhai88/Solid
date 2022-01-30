package solid.liskov.after;

public class Ebook  implements Book, OnlineBook{

	@Override
	public String getName() {
		return "Ebook";
	}

	@Override
	public String getLink() {
		return "http...";
	}

}
