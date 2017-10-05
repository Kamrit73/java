import java.util.Scanner;
class Calculator
{
	static int a,b;
	static 
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("enter the values of a&b");
		a=ip.nextInt();
		b=ip.nextInt();
	}
	static int add()
	{
		return(a+b);
	}
	static int difference()
	{
		return (a-b);
	}
}
class StaticTest
{
	public static void main(String args[])
	{
		System.out.println("Sum="+Calculator.add());
		System.out.println("difference="+Calculator.difference());
	}
}
	