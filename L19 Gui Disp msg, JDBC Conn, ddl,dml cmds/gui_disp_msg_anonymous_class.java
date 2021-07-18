// GUI to display msg using JButton using Anonymous class

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class A3 extends JFrame
{
	Container c;
	JLabel lbl_name;
	JTextField txt_name;
	JButton btn_submit;

	A3()
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

		btn_submit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
			String name = txt_name.getText();
			String msg = "Good Afternoon " + name;
			JOptionPane.showMessageDialog(c, msg);
			} });
		setSize(500, 200);
		setTitle("My Third App");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}

class gui_disp_msg_anonymous_class
{
	public static void main(String args[])
	{
		A3 a = new A3();
	}
}