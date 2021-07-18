// create table employee from sqlplus cmd
// program to insert data into employee table

// s1: import the lib
import java.sql.*;
import java.io.*;

class create_TB_insert_data_emp
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
			int id = Integer.parseInt(c.readLine("enter emp id "));
			String name = c.readLine("enter emp name ");
			String sql = "insert into employee values(?, ?)";		// passing two user i/p parameters
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, id);
			pst.setString(2, name);
			pst.executeUpdate();
			System.out.println("record added ");		
	
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