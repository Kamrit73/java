import java.awt.*;
import java.awt.event.*;
class MyButtons extends Frame implements ActionListener
{
	Button b1,b2,b3;//reference variables of class button
	MyButtons()
	{
		this.setLayout(null);
		//3 buttons created
		b1=new Button("yellow");
		b2=new Button("green");
		b3=new Button("blue");
		//set the postions of buttons 
		b1.setBounds(100,100,70,40);
		b2.setBounds(100,160,70,40);
		b3.setBounds(100,220,70,40);
		//add the buttons to the frame
		this.add(b1);
		this.add(b2);
		this.add(b3);
		//add action listeners to the buttons
		b1.addActionListner(this);
		b2.addActionListner(this);
		b3.addActionListner(this);
		//closing the frame
		addWindowListner(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});