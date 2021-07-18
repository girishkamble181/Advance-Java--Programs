// GUI to display msg using JButton using Lambda Expression

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class A7 extends JFrame
{
	Container c;
	JButton b;

	A7()
	{
		c = getContentPane();
		c.setLayout(new FlowLayout());
		b = new JButton("Click Me");
		c.add(b);

		ActionListener a1 = (ae) -> JOptionPane.showMessageDialog(c, "Welcome");
		b.addActionListener(a1);	
	
		setTitle("My 6th App");
		setSize(300, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}


class gui_disp_msg_lambda_exprss_2
{
	public static void main(String args[])
	{
		new A6();
	}
}

// LE --> Java 1.8