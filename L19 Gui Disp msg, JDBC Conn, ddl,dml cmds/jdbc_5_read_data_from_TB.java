// s4 : program to read/view data from table

import java.sql.*;

class jdbc_5_read_data_from_TB
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
			String sql = "select * from student";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next())
				System.out.println("rno = " + rs.getInt(1) + " name = " + rs.getString(2));
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