class ClassDemo1
{
	private int a;
	private int b;
	void setA(int aval)
	{
		a=aval;
	}
	void setB(int bval)
	{
		b=bval;
	}
	int getA()
	{
		return a;
	}
	int getB()
	{
		return b;
	}
}
class ClassDemo
{
	public static void main(String args[])
	{
		ClassDemo1 cd=new ClassDemo1();
		cd.setA(10);
		cd.setB(20);
		System.out.println("the values of a and b are:"+cd.getA()+" "+cd.getB());
	}
}
	