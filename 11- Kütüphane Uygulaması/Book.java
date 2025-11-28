import java.util.Arrays;

public class Book {
	private int id;
	private String name;
	private Author[] authors;
	private Publisher publisher;
	private int pulishingYear;
	private int amountOfPage;
	private double price;
	private CoverType coverType;
	
	public Book(int id, String name, Author[] authors, Publisher publisher, int pulishingYear, int amountOfPage,
			double price, CoverType coverType) {
		super();
		this.id = id;
		this.name = name;
		this.authors = authors;
		this.publisher = publisher;
		this.pulishingYear = pulishingYear;
		this.amountOfPage = amountOfPage;
		this.price = price;
		this.coverType = coverType;
	}
	
	

	public int getId() {
		return id;
	}



	public String getName() {
		return name;
	}



	public Author[] getAuthors() {
		return authors;
	}



	public Publisher getPublisher() {
		return publisher;
	}



	public int getPulishingYear() {
		return pulishingYear;
	}



	public int getAmountOfPage() {
		return amountOfPage;
	}



	public double getPrice() {
		return price;
	}



	public CoverType getCoverType() {
		return coverType;
	}



	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + "]\n" ;//", authors=" + Arrays.toString(authors) + ", publisher="
				//+ publisher + ", pulishingYear=" + pulishingYear + ", amountOfPage=" + amountOfPage + ", price=" + price
				//+ ", coverType=" + coverType + "]\n" ;
	}

	

}
