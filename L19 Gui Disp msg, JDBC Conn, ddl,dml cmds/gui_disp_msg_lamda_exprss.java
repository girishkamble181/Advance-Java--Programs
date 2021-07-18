// GUI to display msg using JButton using Lamda Expression

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class A4 extends JFrame
{
	Container c;
	JLabel lbl_name;
	JTextField txt_name;
	JButton btn_submit;

	A4()
	{
		c = getContentPane();
		FlowLayout fl = new FlowLayout();
		c.setLayout(fl);

		Font f = new Font("Courier", Font.BOLD, 30);
		lbl_name = new JLabel("enter ur name ");
		txt_name = new JTextField(10);
		btn_submit = new JButton("Submit");
		lbl_name.setFont(f);
		txt_name.setFont(f);
		btn_submit.setFont(f);

		c.add(lbl_name);
		c.add(txt_name);
		c.add(btn_submit);

		ActionListener a1 = (ae) -> {
			String name = txt_name.getText();
			String msg = "Good Afternoon " + name;
			JOptionPane.showMessageDialog(c, msg);
			};
		btn_submit.addActionListener(a1);
		setSize(500, 200);
		setTitle("My Third App");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}

class gui_disp_msg_lamda_exprss
{
	public static void main(String args[])
	{
		A3 a = new A3();
	}
}