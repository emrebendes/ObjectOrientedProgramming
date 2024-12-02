package runs;

import java.math.BigDecimal;
import java.util.Arrays;

public class Book {
	int id ;//- unique identifier
	String name;// - name of a book
	Author[] authors ;//- array of authors
	Publisher publisher ;//- book publisher
	int publishingYear ;//- year of publishing
	int amountOfPages ;//- amount of pages
	BigDecimal price ;//- price of a book
	CoverType coverType;// - type of book binding, enum (Paperback, Hardcover)

	

	public Book(int id, String name, Author[] authors, Publisher publisher, int publishingYear, int amountOfPages,
			BigDecimal price, CoverType coverType) {
		super();
		this.id = id;
		this.name = name;
		this.authors = authors;
		this.publisher = publisher;
		this.publishingYear = publishingYear;
		this.amountOfPages = amountOfPages;
		this.price = price;
		this.coverType = coverType;
	}



	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", authors=" + Arrays.toString(authors) + ", amountOfPages="
				+ amountOfPages + ", coverType=" + coverType + "]";
	}
	
		

}
