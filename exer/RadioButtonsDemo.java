import java.awt.*;
import java.awt.event.*;
class RadioButtonsDemo extends Frame implements ItemListener
{
	String msg="";
	//CheckboxGroup cbg;
	Checkbox y,n;
	RadioButtonsDemo()
	{
		setLayout(new FlowLayout());
		CheckboxGroup cbg=new CheckboxGroup();
		y=new Checkbox("yes",cbg,true);
		n=new Checkbox("no",cbg,false);
		add(y);
		add(n);
		y.addItemListener(this);
		n.addItemListener(this);
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
		//msg="Current state:";
		msg=cbg.getSelectedCheckBox().getLabel();
		g.drawString(msg,10,100);
	}
	public static void main(String args[])
	{
		RadioButtonsDemo r = new RadioButtonsDemo();
		r.setTitle("Radio Buttons");
		r.setSize(600,600);
		r.setVisibility(true);
	}
}
	