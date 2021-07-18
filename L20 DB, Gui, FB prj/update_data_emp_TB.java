// program to update data into employee table

// s1: import the lib
import java.sql.*;
import java.io.*;

class update_data_emp_TB
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
			Console c = System.console();
			int id = Integer.parseInt(c.readLine("enter emp id to be updated "));
			String name = c.readLine("enter emp new name ");
			String sql = "update employee set name = ? where id = ?";		// passing two user i/p parameters
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, name);
			pst.setInt(2, id);
			int r = pst.executeUpdate();
			System.out.println(r + " record updated ");		
	
		}
		catch(SQLException e)
		{	
			System.out.println("update issue "+ e);	
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