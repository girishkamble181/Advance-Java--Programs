// GUI Program for Coloring background using JButton and BorderLayout
// using inner class

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class A1 extends JFrame
{
	Container c;
	JButton btn_red, btn_green, btn_blue, btn_yellow;
	
		class L1 implements ActionListener
		{
			public void actionPerformed(ActionEvent ae)
			{
				if (ae.getSource() == btn_red)
				{
					c.setBackground(Color.RED);
				}
				else if (ae.getSource() == btn_green)
				{
					c.setBackground(Color.GREEN);
				}
				else if (ae.getSource() == btn_blue)
				{
					c.setBackground(Color.BLUE);
				}
				else if (ae.getSource() == btn_yellow)
				{
					c.setBackground(Color.YELLOW);
				}
			}
		}

	A1()
	{
		c= getContentPane();

		btn_red = new JButton("Red");
		btn_green = new JButton("Green");
		btn_blue = new JButton("Blue");
		btn_yellow = new JButton("Yellow");
	
		c.add(BorderLayout.NORTH, btn_red);
		c.add(BorderLayout.SOUTH, btn_green);
		c.add(BorderLayout.WEST, btn_blue);
		c.add(BorderLayout.EAST, btn_yellow);

		L1 a = new L1();
		btn_red.addActionListener(a);
		btn_green.addActionListener(a);
		btn_blue.addActionListener(a);
		btn_yellow.addActionListener(a);

		setTitle("Color me");
		setSize(500, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}	
}

class gui_color_bg_butn_borderlyt_innercls
{
	public static void main(String args[])
	{
		new A1();
	}
}