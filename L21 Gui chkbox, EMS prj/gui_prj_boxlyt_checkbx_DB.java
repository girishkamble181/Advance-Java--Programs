// GUI Project using boxlayout, checkbox and jdbc

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class A1 extends JFrame
{
	Container c;
	JLabel lbl_name;
	JTextField txt_name;
	JCheckBox cb_notes, cb_software, cb_certificate;
	JButton btn_submit;

	A1()
	{
		c = getContentPane();
		BoxLayout b = new BoxLayout(c, BoxLayout.Y_AXIS);
		c.setLayout(b);

		Font f = new Font("Arial", Font.BOLD|Font.ITALIC, 30);
		lbl_name = new JLabel("enter name");
		lbl_name.setFont(f);
		c.add(lbl_name);
		
		txt_name = new JTextField(10);
		txt_name.setFont(f);
		c.add(txt_name);
	
		cb_notes = new JCheckBox("Notes");
		cb_notes.setFont(f);
		c.add(cb_notes);

		cb_software = new JCheckBox("Software");
		cb_software.setFont(f);
		c.add(cb_software);

		cb_certificate = new JCheckBox("Certificate");
		cb_certificate.setFont(f);
		c.add(cb_certificate);

		btn_submit = new JButton("Submit");
		btn_submit.setFont(f);
		c.add(btn_submit);

		ActionListener a1 = (ae) -> 
		{
			try
			{
				DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "system", "abc123");
				String name = txt_name.getText();
				String information = "";
				if (cb_notes.isSelected())		information += " Notes ";		// only if when using checkbox
				if (cb_software.isSelected())		information += " Software ";		// only if when using checkbox
				if (cb_certificate.isSelected())	information += " Certificate ";		// only if when using checkbox

				String sql = "insert into gk_app values(?, ?)";
				PreparedStatement pst = con.prepareStatement(sql);	// for dynamic data -->  we are taking input from user
				pst.setString(1, name);
				pst.setString(2, information);
				pst.executeUpdate();
				JOptionPane.showMessageDialog(c, "thanks");
				txt_name.setText("");
				cb_notes.setSelected(false);
				cb_software.setSelected(false);
				cb_certificate.setSelected(false);
				con.close();
			}
			catch(SQLException e)
			{
				JOptionPane.showMessageDialog(c, "issue" + e);
				System.out.println("issue "+ e);
			}
		};
		btn_submit.addActionListener(a1);

		setTitle("Girish.K App");
		setSize(500, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

		
}

class gui_prj_boxlyt_checkbx_DB
{
	public static void main(String args[])
	{
		new A1();
	}
}