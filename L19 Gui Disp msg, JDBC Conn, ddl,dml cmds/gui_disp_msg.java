// GUI Program to display msg

import javax.swing.*;		//JFrame , JLabel
import java.awt.*;		//container, Font, Color

class A1 extends JFrame
{
	Container c;
	JLabel lbl_msg;

	A1()
	{
		c = getContentPane();
		Font f = new Font("Arial", Font.BOLD, 100);
		lbl_msg = new JLabel("Good Afternoon", JLabel.CENTER);
		lbl_msg.setFont(f);
		lbl_msg.setForeground(Color.RED);
		c.add(lbl_msg);

		setTitle("First App by Girish");
		setSize(800, 400);						//windows size
		setLocationRelativeTo(null);					// align window in center
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			// to close window		
		setVisible(true);						// display
	}
}

class gui_disp_msg
{
	public static void main(String args[])
	{
		A1 a = new A1();
	}
}