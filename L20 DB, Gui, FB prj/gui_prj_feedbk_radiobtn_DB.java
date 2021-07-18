// gui project for feedback using radiobutton and db connectivity

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class Fb extends JFrame
{
	Container c;
	JLabel lbl_name, lbl_rateus;
	JTextField txt_name;
	JRadioButton rb_good, rb_ok, rb_bad;
	JButton btn_submit;

	Fb()
	{
		c = getContentPane();
		c.setLayout(null);
		
		Font f = new Font("Times New Roman", Font.BOLD, 30);

		lbl_name = new JLabel("Enter Name ");
		txt_name = new JTextField(10);
		
		lbl_rateus = new JLabel("Rate Us ");
		rb_good = new JRadioButton("Good");
		rb_ok = new JRadioButton("Ok");
		rb_bad = new JRadioButton("Bad");

		btn_submit = new JButton("Submit");

		lbl_name.setBounds(100, 20, 250, 50);
		lbl_name.setFont(f);
		c.add(lbl_name);

		txt_name.setBounds(20, 80, 350, 50);
		txt_name.setFont(f);
		c.add(txt_name);

		lbl_rateus.setBounds(100, 140, 250, 50);
		lbl_rateus.setFont(f);
		c.add(lbl_rateus);

		ButtonGroup bg = new ButtonGroup();
		bg.add(rb_good);	
		bg.add(rb_ok);
		bg.add(rb_bad);

		rb_good.setBounds(20, 200, 100, 50);
		rb_good.setFont(f);
		c.add(rb_good);

		rb_ok.setBounds(140, 200, 100, 50);
		rb_ok.setFont(f);
		c.add(rb_ok);

		rb_bad.setBounds(240, 200, 100, 50);
		rb_bad.setFont(f);
		c.add(rb_bad);
				//    x    y    w    h
		btn_submit.setBounds(100, 280, 200, 50);
		btn_submit.setFont(f);
		c.add(btn_submit);

		ActionListener a1 = (ae) ->
		{
			try
			{
				DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "system", "abc123");
				
				String name = txt_name.getText();
				String review = "";	
		
				if (rb_good.isSelected())
					review = "Good";
				else if (rb_ok.isSelected())
					review = "Ok";
				else
					review = "Bad";

				String sql = "insert into thambi_feedback values(?, ?)";
				PreparedStatement pst = con.prepareStatement(sql);
				pst.setString(1, name);
				pst.setString(2, review);
				pst.executeUpdate();
				JOptionPane.showMessageDialog(c, "Thanks for ur Feedback");
		
				con.close();				
			}
			catch(SQLException e)
			{
				System.out.println("issue "+ e);
			}
		};
		btn_submit.addActionListener(a1);

		setTitle("Customer Feedback by GK ");
		setSize(700, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}	
}


class gui_prj_feedbk_radiobtn_DB
{
	public static void main(String args[])
	{
		Fb f = new Fb();
	}
}