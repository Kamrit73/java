class UseStatic1
{
	static int a=3;
	static int b;
	static void meth(int x)
	{
		System.out.print("x="+x);
		System.out.print("a="+a);
		System.out.print("b="+b);
	}
	static
	{
		System.out.print("static block initialised");
		b=a*4;
	}
}
class StaticDema
{
	public static void main(String args[])
	{
		meth(42);
	}
}

		