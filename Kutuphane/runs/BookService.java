package runs;

import java.util.ArrayList;

public class BookService {
	public ArrayList<Book> filterBooksByAuthor(Author author, Book[] books) {
		ArrayList<Book> filteredBook = new ArrayList<Book>();
		for (Book book : books) {
			for (Author authorOfBook : book.authors) {
				if (author.equals(authorOfBook)) {
				//if (author.firstName == authorOfBook.firstName && author.lastName == authorOfBook.lastName) {	
					filteredBook.add(book);					
				}
			}		
		}		
		return filteredBook;
	}

	/*public Book[] filterBooksByPublisher(Publisher publisher, Book[] books) {
		<write your code here>
	}

	// methods keeps books with publishing year inclusively.
	public Book[] filterBooksAfterSpecifiedYear(int yearFromInclusively, Book[] books) {
		<write your code here>
	}*/
}
