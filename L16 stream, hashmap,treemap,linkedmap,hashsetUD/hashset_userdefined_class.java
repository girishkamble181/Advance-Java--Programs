//wap for user defined class using hashset

import java.util.*;

class Book
{
	int id;
	String name;
	double price;

	Book(int id, String name, double price)
	{
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public String toString()
	{
		return id + " " + name + " " + price;
	}

	public boolean equals(Object o)
	{
		Book b = (Book)o;
		return id == b.id;
	}

	public int hashCode()
	{
		return id;
	}
}

class hashset_userdefined_class
{
	public static void main(String args[])
	{
		Book b1 = new Book(10, "Java Prog", 500);	// constructor
		Book b2 = new Book(40, "ML Prog", 500);
		Book b3 = new Book(20, "AWS Prog", 500);
		Book b4 = new Book(30, "Django Prog", 500);
		Book b5 = new Book(20, "Android Prog", 500);

		HashSet<Book> b = new HashSet<>();
		b.add(b1);	b.add(b2);	b.add(b3);	b.add(b4);	b.add(b5);	// equals() --> hashCode()
	
		for(Book k : b)
			System.out.println(k);			// toString()
	}
}