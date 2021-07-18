// GUI to display msg using JButton using inner class

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class A5 extends JFrame
{
	Container c;
	JButton b;

	class L1 implements ActionListener			// inner class 
	{
		public void actionPerformed(ActionEvent ae)
		{
			JOptionPane.showMessageDialog(c, "Welcome");
		}
	}

	A5()
	{
		c= getContentPane();
		c.setLayout(new FlowLayout());
		b= new JButton("click me");
		c.add(b);
		
		b.addActionListener(new L1());

		setTitle("My 5th App");
		setSize(300, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}

class gui_disp_msg_inner_class
{
	public static void main(String args[])
	{
		new A5();
	}
}