import java.lang.Scanner;
class ExceptionDemo1 extends exception
{
	
	private int detail;
	ExceptionDemo1(int a)
	{
		detail=a;
	}
	public String toString()
	{
		return "Caught ExceptionDemo1 ["+detail+"]";
	}
}
class Myexception 
{
	static void compute(int a)throws ExceptionDemo1
	{
		System.out.println("called compute ["+a+"]");
		if(a>10)
		throw new ExceptionDemo1(a);
	System.out.println("normal exit");
	}
	public static void main(String args[])
	{
		try{
			compute(1);
			compute(25);
		}catch(ExceptionDemo1 e){
			System.out.println("caught"+e);
		}
	}
}	
			