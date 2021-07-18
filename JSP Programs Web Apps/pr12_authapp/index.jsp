<%@ page import="java.sql.*" %>

<html>
<head>
	<title> App Designed by GK </title>
	<style>
		* { font-size:40px; font-family:Courier; }
		button a{ text-decoration: none; color:red;}
	</style>
</head>
	
<body style="background-color:powderblue;">
	<center>
		<h1> Login Page </h1>
		<form method="POST">
			<input type="text" name="un" placeholder="enter username " required>
			<br><br>
			<input type="password" name="pw" placeholder="enter password " required>
			<br><br>
			<input type="submit" value="Login" name="b1">
			<br>
		</form>
		<button> <a href="signup.jsp"> SignUp </a></button>
	
		<%
			if (request.getParameter("b1") != null )
			{
				String un = request.getParameter("un");
				String pw = request.getParameter("pw");
				try
				{
					DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());	
					Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","system","abc123");
					String sql = "select * from kc_users where username = ? ";
					PreparedStatement pst = con.prepareStatement(sql);
					pst.setString(1, un);
					ResultSet rs = pst.executeQuery();
					if (rs.next())
					{
						String p = rs.getString(2);
						if (p.equals(pw))
						{
							request.getSession().setAttribute("user", un);
							response.sendRedirect("main.jsp");
						}
						else
						{
							out.println("incorrect password ");
						}
					}
					else
					{
						out.println("user does not exists ");
					}
					con.close();
				}
				catch(SQLException e)
				{
					out.println("issue " + e);
				}
			}
		%>
			
	<center>
</body>
</html>