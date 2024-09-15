package solid.liskov.after;

import java.util.List;

public class Client {
	
	/*
	 * To respect Liskov rule, we transform the abstract class Book into interfaces Book and PrintBook
	 */
	public void printMaterialBookInfo(List<PrintedBook> books) {
		for (PrintedBook book : books) {
			book.getMaterial();
		}
	}

	public void printCommonBookInfo(List<Book> books) {
		for (Book book : books) {
			book.getName();
			if (book instanceof PrintedBook printedBook) {
				printedBook.getMaterial();
			} else if (book instanceof OnlineBook onlineBook) {
				onlineBook.getLink();
			}
		}
	}

}
