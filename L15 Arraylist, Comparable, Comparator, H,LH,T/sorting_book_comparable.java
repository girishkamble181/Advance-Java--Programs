// sorting using Comparable

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

	public int compareTo(Book b)
	{
		return (int)(b.price - price);
	}
}

class sorting_book_comparable
{
	public static void main(String args[])
	{
		Book b1 = new Book(10,"ML", 700);
		Book b2 = new Book(30,"ML", 300);
		Book b3 = new Book(40,"ML", 500);
		Book b4 = new Book(20,"ML", 800);

		ArrayList<Book> b = new ArrayList<>();
		b.add(b1);		b.add(b2);
		b.add(b3);		b.add(b4);
			
		Collections.sort(b);
		for(Book k : b)
			System.out.println(k);
	}
}