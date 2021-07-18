package pa;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class W1 extends JFrame
{
	Container c;
	JButton btn_welcome;

	W1()
	{
		c = getContentPane();
		c.setLayout(new FlowLayout());
		
		btn_welcome = new JButton("click me");
		c.add(btn_welcome);

		ActionListener a1 = ae -> JOptionPane.showMessageDialog(c, "Good Afternoon");
		btn_welcome.addActionListener(a1);

		setTitle("Welcome App");
		setSize(300, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() 
		{
			public void windowClosing(WindowEvent e) 
				{ 
					int confirmed = JOptionPane.showConfirmDialog(null, "are u sure u want to exit?", "Exit Program Message Box", JOptionPane.YES_NO_OPTION);
					if (confirmed == JOptionPane.YES_OPTION)
					dispose();	
				}
		});
	}
}

class W1Test
{
	public static void main(String args[])
	{
		W1 w = new W1();
	}
}