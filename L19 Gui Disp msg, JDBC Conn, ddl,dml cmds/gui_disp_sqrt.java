// GUI to display sqrt 

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class A9 extends JFrame
{
	Container c;
	JLabel lbl_number;
	JTextField txt_number;
	JButton btn_find;

	A9()
	{
		c = getContentPane();			
		c.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));		// hgap, vgap
		
		lbl_number = new JLabel("enter a number");	
		txt_number = new JTextField(14);
		btn_find = new JButton("Find");

		Font f = new Font("Times New Roman", Font.BOLD|Font.ITALIC, 30);
		lbl_number.setFont(f);
		txt_number.setFont(f);
		btn_find.setFont(f);
		
		c.add(lbl_number);
		c.add(txt_number);
		c.add(btn_find);

		ActionListener a1 = (ae) -> 
		{
			try
			{
				String s = txt_number.getText();
				Double num = Double.parseDouble(s);
				if (num < 0)
				{
					JOptionPane.showMessageDialog(c, "invalid number");
					txt_number.setText("");
					txt_number.requestFocus();
				}
				else{
					double res = Math.sqrt(num);
					String msg = "ur number is " + num + " and square root = "  + res;
					JOptionPane.showMessageDialog(c, msg); 
				}
			}
			catch(NumberFormatException e)
			{
				JOptionPane.showMessageDialog(c, "invalid number");
				txt_number.setText("");
				txt_number.requestFocus();
			
			}
		
		};
		
		btn_find.addActionListener(a1);
	
		setTitle("Even odd calci");
		setSize(400,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}

class gui_disp_sqrt
{
	public static void main(String args[])
	{
		new A9();
	}
}