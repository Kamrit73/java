class A
{
	int i,j
	void showij()
	{
		System.out.println("the values of i and j are:"+i+""+j);
	}
}
class B extends A
{
	int k;
	void showk()
	{
		System.out.println("the value of k is"+k);
	}
	void sum()
	{
		System.out.println("sum of i j k is "+(i+j+k));
	}
}
class InheritanceDemo
{
	public static void main(String args[])
	{
	A supob=new A();
	B subob=new B();
	supob.i=10;
	supob.j=20;
	System.out.println("the values of i and j are :"+supob.showij());
	subob.k=30;
	subob.i=40;
	subob.j=50;
	System.out.println("the values of i and j are :"+supob.showk());
	System.out.println("the sum of i j k is :"+supob.sum());
	}
}
