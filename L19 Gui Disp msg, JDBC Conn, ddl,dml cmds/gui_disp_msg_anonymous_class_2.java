// GUI to display msg using JButton using Anonymous class

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class A6 extends JFrame
{
	Container c;
	JButton b;

	A6()
	{
		c = getContentPane();
		c.setLayout(new FlowLayout());
		b = new JButton("Click Me");
		c.add(b);

		b.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent ae)
				{
					JOptionPane.showMessageDialog(c, "Welcome");
				}
			});
		
		setTitle("My 6th App");
		setSize(300, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}


class gui_disp_msg_anonymous_class_2
{
	public static void main(String args[])
	{
		new A6();
	}
}

// AC --> Java 1.2