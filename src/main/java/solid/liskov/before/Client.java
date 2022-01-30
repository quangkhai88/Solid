package solid.liskov.before;

import java.util.List;

public class Client {
	
	
	/*
	 * 
	 * Here we violate Liskov principle,
	 * If books has one Ebook object => get exception
	 */
	
	public void printBookMaterialInfo(List<Book> books) {
		
		for (Book book : books) {
			book.getMaterial();
		}
	}

}
