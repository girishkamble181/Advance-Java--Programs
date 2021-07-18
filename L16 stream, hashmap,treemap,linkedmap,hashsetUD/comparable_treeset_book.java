//wap using Comparable

import java.util.*;

class Book implements Comparable<Book>
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

	public int compareTo(Book b)
	{
		return (int)(b.price - price);
	}
}

class comparable_treeset_book
{
	public static void main(String args[])
	{
		Book b1 = new Book(10, "Android Prog", 500);
		Book b2 = new Book(40, "ML Prog", 600);
		Book b3 = new Book(20, "Django Prog", 400);
		Book b4 = new Book(30, "Aws Prog", 900);
		Book b5 = new Book(20, "Django Prog", 400);

		TreeSet<Book> b = new TreeSet<>();
		b.add(b1);		b.add(b2);	b.add(b3);
		b.add(b4);		b.add(b5);

		for(Book k : b)	
			System.out.println(k);
	}
}