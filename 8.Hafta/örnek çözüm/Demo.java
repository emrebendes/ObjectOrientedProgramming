import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		List<Book> books = Arrays.asList(
				new Book(1, "Book_1", new Author[] { new Author(1, "Jon", "Johnson") },	new Publisher(1, "Publisher_1"), 1990, 231,	24.99, CoverType.PAPERBACK),
				new Book(2, "Book_2", new Author[] { new Author(1, "Jon", "Johnson"),new Author(2, "William", "Wilson") },new Publisher(2, "Publisher_2"), 2000, 120,14.99, CoverType.PAPERBACK),
				new Book(3, "Book_3", new Author[] { new Author(3, "Walter", "Peterson") },new Publisher(1, "Publisher_1"), 1997, 350,34.99, CoverType.HARDCOVER),
				new Book(4, "Book_4", new Author[] { new Author(4, "Craig", "Gregory") },new Publisher(3, "Publisher_3"), 1992, 185,19.99, CoverType.PAPERBACK)
				);

		BookService bookService = new BookService();
		
		System.out.println(bookService.filterBooksByAuthor(new Author(1, "Jon", "Johnson"), books));
		
		System.out.println(bookService.filterBooksByPublisher(new Publisher(3, "Publisher_3"), books));
		
		System.out.println(bookService.filterBooksAfterSpecifiedYear(1992, books));


	}

}


