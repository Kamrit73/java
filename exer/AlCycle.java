import java.awt.*;
import java.applet.*;
public class AlCycle extends Applet
{
	String msg=" ";
	public void init()
	{
		setBackground(Color.yellow);
		setForeground(Color.red);
		Font f=new Font("Arial",Font.BOLD,20);
		setFont(f);
		msg+="init";
	}
	public void start()
	{
		msg+="start";
	}
	public void stop()
	{
		msg+="stop";
	}
	public void paint(Graphics g)
	{
		msg+="paint";
		g.drawString(msg,50,100);
	}
	public void destroy()
	{
		msg+="destroy";
	}
}
/*<html>
<applet code="AlCycle.class" height=400 width=400>;
</applet>
</html>*/