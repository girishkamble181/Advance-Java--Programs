// GUI to display msg using JButton using nested class

import javax.swing.*;			//JFrame, JLabel, JTextField, JButton
import java.awt.*;			// Container, Color, Font, Graphics,  FlowLayout, BorderLayout, BoxLayout
import java.awt.event.*;		// ActionListner

class A2 extends JFrame							// outer class
{
	Container c;
	JLabel lbl_name;
	JTextField txt_name;
	JButton btn_submit;

		class MyA1 implements ActionListener			// inner class / nested class
		{
			public void actionPerformed(ActionEvent ae)
			{
				String name = txt_name.getText();
				String msg = "Good Afternoon " + name;
				JOptionPane.showMessageDialog(c, msg);
			}
		}
	
	A2()
	{
		c = getContentPane();
		FlowLayout f1= new FlowLayout();
		c.setLayout(f1);
		
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

		MyA1 a = new MyA1();
		btn_submit.addActionListener(a);

		setSize(500,200);
		setTitle("My Second App");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
}


class gui_disp_msg_JButton_nestedclass
{
	public static void main(String args[])
	{
		A2 a = new A2();
	}
}