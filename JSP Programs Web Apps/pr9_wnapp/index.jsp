<%@ page import="java.sql.*"  %>

<html>
<head>
	<title> WN App by GK </title>
	<style>
		* { font-size:30px; }
	</style>
</head>

<body>
	<center>
		<h1>Fill the Form</h1>
		<form method="POST">
			<input type="text" name="n" placeholder="enter ur name" required>
			<br> <br>			
			<input type="radio" name="r1" value="job" checked> Job </input>
			<input type="radio" name="r1" value="ms" > MS </input>
			<input type="radio" name="r1" value="mba" > MBA </input>
			<br><br>
			<input type="submit" name="b1">
		</form>
		
		<%
			if(request.getParameter("b1") != null)
			{
				String name = request.getParameter("n");
				String choice = "";				
				String op = request.getParameter("r1");
				if (op.equals("job"))
				{
					choice = "Job";
				}
				else if (op.equals("ms"))
				{
					choice = "MS";
				}
				else
				{
					choice = "MBA";
				}
				try
				{
					DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
					Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","system","abc123");
					
					String sql = "insert into what_next_app values(?, ?)";
					PreparedStatement pst = con.prepareStatement(sql);
					pst.setString(1, name);
					pst.setString(2, choice);
					pst.executeUpdate();
					out.println("thanks");
		%>

			<script>
				alert("thanks for filling form ")
			</script>

		<%
				}
				catch(SQLException e)
				{
					out.println("issue " + e);
				}
				
			}
		%>
	</center>

</body>
</html>