abstract class A
{
	abstract void callme();
	void callmetoo()
	{
		System.out.println("a concrete method");
	}
}
class B extends A
{
	void callme()
	{
		System.out.println("b's implementation of a ");
	}
}
class Abstract
{
	public static void main(String args[])
	{
		B b=new B();
		b.callme();
		b.callmetoo();
	}
}