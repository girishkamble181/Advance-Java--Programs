<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<%@ page import="javax.mail.*" %>
<%@ page import="javax.mail.internet.*" %>
<%@ page import="javax.activation.*" %>

<html>
<head>
	<title> DE PHOTOGRAPHY </title>
	<style> * {font-size: 40px; } </style>
</head>

<body>
<center>
	<h1> Subscribe for Updates </h1>
	<form method="POST">
		<input type="email" name="em" placeholder="enter email" required>
		<br><br>
		<input type="submit" value="subscribe" name="b1">
	</form>

	<%
		if (request.getParameter("b1") != null)
		{
			try
			{
				DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","system","abc123");
				String sql = "insert into de_email values(?)";
				PreparedStatement pst = con.prepareStatement(sql);
				String em = request.getParameter("em");
				pst.setString(1, em);
				pst.executeUpdate();
		
				Properties p = System.getProperties();
				p.put("mail.smtp.host", "smtp.gmail.com");
				p.put("mail.smtp.port", "587");
				p.put("mail.smtp.auth", "true");
				p.put("mail.smtp.starttls.enable", true);

				Session ms = Session.getInstance(p, new Authenticator(){
				public PasswordAuthentication getPasswordAuthentication(){
					return new PasswordAuthentication("test.girishkamble@gmail.com", "test@abc123");
				}
				});

				try
				{
					MimeMessage msg = new MimeMessage(ms);
					msg.setSubject("DE PHOTOGRAPHY");
					msg.setText("Congrats for ur subscription");
					msg.addRecipient(Message.RecipientType.TO, new InternetAddress(request.getParameter("em")));
					Transport.send(msg);
					out.println("Congrats...");
				}
				catch(Exception e)
				{
					out.println("issue " + e);	
				}

				con.close();
			}
			catch(SQLException e)
			{
				out.println("email already exists ");
			}
		}
	%>
</center>
</body>
</html>