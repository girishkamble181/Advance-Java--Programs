// draw chart using data from database

import javax.swing.*;
import org.jfree.chart.*;
import org.jfree.chart.plot.*;
import org.jfree.data.category.*;
import java.io.*;
import java.sql.*;

class A5 extends JFrame
{
	A5()
	{
		DefaultCategoryDataset ds = new DefaultCategoryDataset();
	
		try
		{
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "system", "abc123");
			String sql = "select * from kc_students";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while(rs.next())
			{
				ds.addValue(rs.getInt(3), rs.getString(2), "Phy");
				ds.addValue(rs.getInt(3), rs.getString(2), "Chem");
				ds.addValue(rs.getInt(3), rs.getString(2), "Math");
			}
			con.close();
		}
		catch(SQLException e)
		{
			System.out.println("issue " + e);
			System.exit(1);
		}

		// s2 --> design chart
		JFreeChart ch = ChartFactory.createBarChart("Student's Performance", "Subject", "Marks", ds,  PlotOrientation.VERTICAL, true, true, false);
		
		// s3 --> display chart
		ChartPanel cp = new ChartPanel(ch);
		setContentPane(cp);

		// s4 --> save the chart
		try
		{
			File f = new File("Students.jpeg");
			ChartUtilities.saveChartAsJPEG(f, ch, 500, 400);
		}
		catch(IOException e)
		{
			System.out.println("issue " + e);
		}

		setTitle("My First Chart App ");
		setSize(500, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}

class chart5_data_frm_DB
{
	public static void main(String args[])
	{
		new A5();
	}
}