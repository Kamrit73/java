class ThisDemo
{
	int i;
	ThisDemo(int x)
	{
		this.i=x;
	}
	this Add(this ob)
	{
		this.i=this0i+ob.j;
		return this;
	}
}
class ThisTest
{
	public static void main(String args[])
	{
		ThisDemo obj1=new ThisDemo(11);
		ThisDemo obj2=new ThisDemo(21);
		obj1=obj1.add(obj2);
		System.out.println("obj.i);
	}
}