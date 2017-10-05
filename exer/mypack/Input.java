package mypack;
public class Input
{
	public double r;
	public Input(double a)
	{
		r=a;
	}
	public void find()
	{
		double perimeter=2*3.16*r;
		double area=3.16*r*r;
		System.out.println("areia is"+area);
		System.out.println("perimenters"+perimeter);
	}
}