package runs;

import java.math.BigDecimal;
import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		Book[] books = new Book[] {
				new Book(1, "Daðlar", new Author[] { new Author(1, "Jon", "Johnson") }, new Publisher(1, "Publisher_1"), 1990, 231, BigDecimal.valueOf(24.99), CoverType.PAPERBACK),
				new Book(2, "çiçekler", new Author[] { new Author(1, "Jon", "Johnson"), new Author(2, "William", "Wilson") }, new Publisher(2, "Publisher_2"), 2000, 120, BigDecimal.valueOf(14.99), CoverType.PAPERBACK),
				new Book(3, "Böcekler", new Author[] { new Author(3, "Walter", "Peterson") }, new Publisher(1, "Publisher_1"), 1997, 350, BigDecimal.valueOf(34.99), CoverType.HARDCOVER),
				new Book(4, "Kuþlar", new Author[] { new Author(4, "Craig", "Gregory") }, new Publisher(3, "Publisher_3"), 1992, 185, BigDecimal.valueOf(19.99), CoverType.PAPERBACK) };
		
		//for (Book book : books)
		//System.out.println(book);
		
		//System.out.println(Arrays.toString(books));
		BookService bookService = new BookService();

		
		for (Book book :bookService.filterBooksByAuthor(new Author(2, "William", "Wilson"), books))
			System.out.println(book);
			
		
	}

}
