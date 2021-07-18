// GUI Program for Coloring background using JButton and BorderLayout
// using Anonymous class

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class A2 extends JFrame
{
	Container c;
	JButton btn_red, btn_green, btn_blue, btn_yellow;

	A2()
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

		
		btn_red.addActionListener(new ActionListener()	{
			public void actionPerformed(ActionEvent ae){
			c.setBackground(Color.RED);
			}	
		});
		btn_green.addActionListener(new ActionListener()	{
			public void actionPerformed(ActionEvent ae){
			c.setBackground(Color.GREEN);
			}	
		});
		btn_blue.addActionListener(new ActionListener()	{
			public void actionPerformed(ActionEvent ae){
			c.setBackground(Color.BLUE);
			}	
		});
		btn_yellow.addActionListener(new ActionListener()	{
			public void actionPerformed(ActionEvent ae){
			c.setBackground(Color.YELLOW);
			}	
		});

		setTitle("Color me");
		setSize(500, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}	
}

class gui_color_bg_borderlyt_anonymous_cls
{
	public static void main(String args[])
	{
		new A2();
	}
}