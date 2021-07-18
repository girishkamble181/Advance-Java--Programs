// draw chart, data from user for single student

import javax.swing.*;
import org.jfree.chart.*;
import org.jfree.chart.plot.*;
import org.jfree.data.category.*;
import java.io.*;

class A2 extends JFrame
{
	A2()
	{
		Console c = System.console();
		String name = c.readLine("enter students name ");
		int phy = Integer.parseInt(c.readLine("enter phy "));
		int chem = Integer.parseInt(c.readLine("enter chem "));
		int math = Integer.parseInt(c.readLine("enter maths "));
		
		// s1 --> data set
		DefaultCategoryDataset ds = new DefaultCategoryDataset();
		ds.addValue(phy, name, "Phy");
		ds.addValue(chem, name, "Chem");
		ds.addValue(math, name, "Math");

		// s2 --> design chart
		JFreeChart ch = ChartFactory.createBarChart(name+ "'s Performance", "Subject", "Marks", ds,  PlotOrientation.VERTICAL, true, true, false);
		
		// s3 --> display chart
		ChartPanel cp = new ChartPanel(ch);
		setContentPane(cp);

		setTitle("My First Chart App ");
		setSize(500, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}

class chart2_data_frm_singleuser
{
	public static void main(String args[])
	{
		new A2();
	}
}