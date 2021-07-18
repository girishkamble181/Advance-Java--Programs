// draw chart, from hardcoded data

import javax.swing.*;
import org.jfree.chart.*;
import org.jfree.chart.plot.*;
import org.jfree.data.category.*;

class A1 extends JFrame
{
	A1()
	{
		// s1 --> data set
		DefaultCategoryDataset ds = new DefaultCategoryDataset();
		ds.addValue(89, "indra", "Phy");
		ds.addValue(50, "indra", "Chem");
		ds.addValue(78, "indra", "Math");

		// s2 --> design chart
		JFreeChart ch = ChartFactory.createBarChart("Indra's Performance", "Subject", "Marks", ds,  PlotOrientation.VERTICAL, true, true, false);
		
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

class chart1_hardcore_data
{
	public static void main(String args[])
	{
		new A1();
	}
}