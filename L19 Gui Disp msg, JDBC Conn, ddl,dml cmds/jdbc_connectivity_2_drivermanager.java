// s1 : program for jdbc db connectivity using drivermanager

import java.sql.*;

class jdbc_connectivity_2_drivermanager
{
	public static void main(String args[])
	{
		Connection con = null;
		try
		{
			// s2: load the driver
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		
			// s3: connect 
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","system","abc123");
			System.out.println("connected");
				
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