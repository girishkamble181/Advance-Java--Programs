<%@ page import="java.sql.*" %>

<html>
<head>
	<title> App Designed by GK </title>
	<style>
		* { font-size:40px; font-family:Courier; }
		button a{ text-decoration: none; color:red; }
	</style>
</head>
	
<body style="background-color:powderblue;">
	<center>
		<h1> SignUp Page </h1>
		<form method="POST">
			<input type="text" name="un" placeholder="enter username " required>
			<br><br>
			<input type="password" name="pw1" placeholder="enter password " required>
			<br><br>
			<input type="password" name="pw2" placeholder="confirm password " required>
			<br><br>

			<input type="submit" value="Register" name="b1">
			<br>
		</form>
		<button> <a href="index.jsp"> Home </a></button>
	
		<%
			if (request.getParameter("b1") != null )
			{
				String un = request.getParameter("un");
				String pw1 = request.getParameter("pw1");
				String pw2 = request.getParameter("pw2");
				if(pw1.equals(pw2))
				{
					try
					{
						DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());	
						Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","system","abc123");
						String sql = "insert into kc_users values(?, ?)";
						PreparedStatement pst = con.prepareStatement(sql);
						pst.setString(1, un);
						pst.setString(2, pw1);
						pst.executeUpdate();
			%>
				<script>
					alert("Registered Succesfully");
				</script>
				
			<%		
						con.close();	
						//response.sendRedirect("index.jsp");
					}
					catch(SQLException e)
					{
						out.println("username already registered");
					}
			
				}
				else
				{
					out.println("password did not match");
				}
			}
		%>
			
	</center>
</body>
</html>