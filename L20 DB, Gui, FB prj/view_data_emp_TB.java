// program to view data from employee table

// s1: import the lib
import java.sql.*;
import java.io.*;

class view_data_emp_TB
{
	public static void main(String args[])	
	{
		Connection con = null;

		try
		{
			// s2: load the driver
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		
			// s3: connect
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "system", "abc123");
			System.out.println("connected");

			// s4: dml
			String sql = "select * from employee";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next())
				System.out.println("id =  " + rs.getInt(1) + " name = " + rs.getString(2));
			rs.close();											//optional
			stmt.close();											//optional
	
		}
		catch(SQLException e)
		{	
			System.out.println("insertion issue "+ e);	
		}

		finally
		{
			// s5: disconnect
			try
			{
				con.close();
				System.out.println("disconnected");
			}
			catch(SQLException e)
			{	
				System.out.println("closing insertion issue "+ e);	
			}
		}
	}
}