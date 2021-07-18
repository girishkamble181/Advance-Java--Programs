// s4 : program to insert data into table

import java.sql.*;

class jdbc_4_insert_data_in_TB
{
	public static void main(String args[])
	{
		Connection con = null;
		try
		{
			// s1: load the driver
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			
			// s2: connect
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "system", "abc123");
			System.out.println("connected");

			// s3: ddl/dml
			String sql = "insert into student values(20, 'kodag')";
			Statement stmt = con.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("record created ");
		}
		catch(SQLException e)
		{
			System.out.println("sqle --> "+e);
		}	
		finally
		{
			// s4: disconnect
			if (con != null)
			{
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
}