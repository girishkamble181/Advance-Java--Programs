//jdbc db connectivity using class.forName

import java.sql.*;

class jdbc_connectivity_1_classForName
{
	public static void main(String args[])
	{
		Connection con = null;
		try
		{	
			// s2: load the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
	
			// s3: connect 
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","system","abc123");
			System.out.println("connected");	
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("cnfe "+e);
		}
		catch(SQLException e)
		{
			System.out.println("sqle "+e);
		}
		finally
		{
			// s4: disconnect
			if (con != null)
			try
			{
				con.close();
				System.out.println("dis connected");
			}
			catch(SQLException e)
			{
				System.out.println("sqle "+e);
			}
		}
	}
}