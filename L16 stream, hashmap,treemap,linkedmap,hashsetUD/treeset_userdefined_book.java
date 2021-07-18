//user defined using Treeset

import java.util.*;

class AscPrice implements Comparator<Book>
{
	public int compare(Book b1, Book b2)
	{
		return (int)(b1.price - b2.price);
	}
}


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

class treeset_userdefined_book
{
	public static void main(String args[])
	{
		Book b1 = new Book(10, "Android Prog", 500);
		Book b2 = new Book(40, "ML Prog", 600);
		Book b3 = new Book(20, "Django Prog", 400);
		Book b4 = new Book(30, "Aws Prog", 900);
		Book b5 = new Book(20, "Django Prog", 400);

		TreeSet<Book> b = new TreeSet<>(new AscPrice());
		b.add(b1);		b.add(b2);	b.add(b3);
		b.add(b4);		b.add(b5);

		for(Book k : b)	
			System.out.println(k);
	}
}