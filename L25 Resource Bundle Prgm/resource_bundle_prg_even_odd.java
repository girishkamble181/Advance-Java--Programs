//wap to ask the user to enter a number and find if its even or odd using ResourceBundle

import java.io.*;
import java.util.*;
import javax.swing.*;

class resource_bundle_prg_even_odd
{
	public static void main(String args[])
	{
		Console c = System.console();

		String lang = c.readLine("specify ur lang en/fr/de/it/hi/mr ");
		Locale loc = new Locale(lang);
		ResourceBundle rb = ResourceBundle.getBundle("k1", loc);

		int num = Integer.parseInt(c.readLine(rb.getString("m1")));
		String res = num % 2 == 0 ? "even" : "odd";
		String msg = rb.getString("m2") + " " + num + " " + rb.getString("m3") + res;
		System.out.println(msg);
		JOptionPane.showMessageDialog(null, msg);
	}
}