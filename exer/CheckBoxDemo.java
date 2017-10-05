import java.awt.*;
import java.awt.event.*;
class CheckBoxDemo extends Frame implements ItemListener
{
	Checkbox c1,c2,c3;//reference variables for class checkbox
	String msg;
	CheckBoxDemo()
	{
		setLayout(new FlowLayout());
		//creation of checkboxes
		c1=new Checkbox("Bold",true);
		c2=new Checkbox("italic");
		c3=new Checkbox("UnderLine");
		//add the buttons to the Frame
		add(c1);
		add(c2);
		add(c3);
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
	}
	public void itemStateChanged(ItemEvent ie)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString("current state:",10,100);
		msg="Bold:"+c1.getState();
		g.drawString(msg,10,120);
		msg="Italic:"+c2.getState();
		g.drawString(msg,10,140);
		msg="underlines:"+c3.getState();
		g.drawString(msg,10,160);
	}
	public static void main(String args[])
	{
		CheckBoxDemo cbd=new CheckBoxDemo();
		cbd.setTitle("My checkboxes");
		cbd.setSize(600,600);
		cbd.setVisible(true);
	}
}
	
		