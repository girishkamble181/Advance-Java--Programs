class Book
{
	private int id;
	private String title;
	private double price;
	private String author;

	public Book() { }

	public Book(int id, String title, double price, String author)
	{
		this.id = id;
		this.title = title;
		this.price = price;
		this.author = author;			
	}

	// setter --> Mutator
	public void setId(int id) { this.id = id; }
	public void setTitle(String title) { this.title = title; }
	public void setPrice(double price) { this.price = price; }	
	public void setAuthor(String author) { this.author = author; }

	// getter --> Accessor
	public int getId() { return id; }
	public String getTitle() { return title; }
	public double getPrice() { return price; }
	public String getAuthor() { return author; }
	
}