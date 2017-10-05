import java.awt.*;
import java.swing.*;
class GridLayoutEx extends JFrame
{
	GridLayoutEx(String title)
	{
		super(title);
		container c=getContentpane();
		c.setLayout(new GridLayout(2,3));
		JButton b1,b2,b3,b4,b5,b6;
		b1=new JButton("Button1");
		b2=new JButton("Button2");
		b3=new JButton("Button3");
		b4=new JButton("Button4");
		b5=new JButton("Button5");	
		b6=new JButton("Button6");
		c.add(b1);
		c.add(b2);
		c.add(b3);
		c.add(b4);
		c.add(b5);
		c.add(b6);
	}
	public static void main(String args[])
	{
		GridLayout demo=new GridLayoutEx("Grid Layout Example");
		demo.setSize(400,400);
		demo.setVisible(true);
		demo.setDefaultCloseoperation(JFrame.EXIT-OUT-CLOUSE);
	}
}