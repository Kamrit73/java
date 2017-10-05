import java.awt.*;
import java.awt.event.*;
class MyButtons extends Frame implements ActionListener
{
	Button b1,b2,b3;//reference variables of class button
	MyButtons()
	{
		this.setLayout(new FlowLayout());//layout settting using flowlayout
		//3 buttons created
		b1=new Button("yellow");
		b2=new Button("green");
		b3=new Button("blue");
		//set the postions of buttons 
		b1.setBounds(100,100,170,100);
		b2.setBounds(100,160,170,100);
		b3.setBounds(100,220,170,100);
		//add the buttons to the frame 
		this.add(b1);
		this.add(b2);
		this.add(b3);
		//add action listeners to the buttons
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		//closing the frame
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
	}
	//action method when the button is clicked
	public void actionPerformed(ActionEvent ae)
	{
		//String sr=ae.getActionCommand();
		if(ae.getSource()==b1)
			this.setBackground(Color.yellow);
		else if(ae.getSource()==b2)
			this.setBackground(Color.green);
		else
			this.setBackground(Color.blue);
	}
	public static void main(String args[])
	{
		MyButtons mb=new MyButtons();
		mb.setSize(600,600);
		mb.setTitle("ButtonDemo");
		mb.setVisible(true);
	}
}
		