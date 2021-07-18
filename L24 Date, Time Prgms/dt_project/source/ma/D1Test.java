package pa;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.text.*;

class D1 extends JFrame
{
	Container c;
	JButton btnDate, btnTime;

	D1()
	{
		c = getContentPane();
		c.setLayout(new FlowLayout());
		
		btnDate = new JButton("Date");
		btnTime = new JButton("Time");

		c.add(btnDate);
		c.add(btnTime);

		ActionListener a1 = (ae) -> 
		{
			Date d = new Date();
			Locale hi = new Locale("en", "IN");
			DateFormat df1 = DateFormat.getDateInstance(DateFormat.SHORT,hi);
			DateFormat df2 = DateFormat.getDateInstance(DateFormat.MEDIUM, hi);
			DateFormat df3 = DateFormat.getDateInstance(DateFormat.LONG, hi);
			DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, hi);
			String msg = df1.format(d) + "\n" + df2.format(d) + "\n" + df3.format(d) + "\n" + df4.format(d);
			JOptionPane.showMessageDialog(c, msg);
		};
		btnDate.addActionListener(a1);
		
		ActionListener a2 = (ae) -> 
		{
			Date d = new Date();
			Locale hi = new Locale("en", "IN");
			DateFormat df1 = DateFormat.getTimeInstance(DateFormat.DEFAULT,hi);
			DateFormat df2 = DateFormat.getTimeInstance(DateFormat.SHORT,hi);
			DateFormat df3 = DateFormat.getTimeInstance(DateFormat.MEDIUM, hi);
			DateFormat df4 = DateFormat.getTimeInstance(DateFormat.LONG, hi);
			DateFormat df5 = DateFormat.getTimeInstance(DateFormat.FULL, hi);
			String msg = df1.format(d) + "\n" + df2.format(d) + "\n" + df3.format(d) + "\n" + df4.format(d) + "\n" + df5.format(d);
			JOptionPane.showMessageDialog(c, msg);
		};

		btnTime.addActionListener(a2);

		setTitle("DT App by GK");
		setSize(400,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}

class D1Test
{
	public static void main(String args[])
	{
		new D1();
	}
}