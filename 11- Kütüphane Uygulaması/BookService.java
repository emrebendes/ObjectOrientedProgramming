import java.util.ArrayList;
import java.util.List;

public class BookService {

	public List<Book> filterBooksByAuthor(Author author, List<Book> books) {
		List<Book> findedBooks = new ArrayList<Book>();
		for (Book book :books) {			
			for (Author authorOfBook :book.getAuthors()) {
				if (author.equals(authorOfBook))
					findedBooks.add(book);
			}			
		}
		return findedBooks;
	}

	public List<Book> filterBooksByPublisher(Publisher publisher, List<Book> books) {
		List<Book> findedBooks = new ArrayList<Book>();
		for (Book book :books) {			
			if (publisher.equals(book.getPublisher()))
				findedBooks.add(book);
		}
		return findedBooks;
	}

	public List<Book> filterBooksAfterSpecifiedYear(int i, List<Book> books) {
		List<Book> findedBooks = new ArrayList<Book>();
		for (Book book :books) {			
			if (book.getPulishingYear() >= i)
				findedBooks.add(book);
		}
		return findedBooks;
	}
}
