import java.io.*;
class A
{
	void callme()
	{
		System.out.println("Inside A");
	}
}
class B extends A
{
	void callme()
	{
		System.out.println("Inside B");
	}
}
class C extends A
{
	void callme()
	{
		System.out.println("Inside c");
	}
}
class Dispatch
{
	public static void main(String args[])throws IOException
	{
		A a=new A();
		B b=new B();
		C c=new C();
		A r;//reference variable of type a
		r=a;
		r.callme();
		r=b;
		r.callme();
		r=c;
		r.callme();
	}
}