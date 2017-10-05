import java.util.Scanner;
import java.io.*;
class SwitchOperations
{
	public static void main(String args[]) throws IOException
	{
		Scanner ip=new Scanner(System.in);
		int a,b;
		System.out.print("enter the value of a:");
		a=ip.nextInt();
		System.out.print("enter the value ob b");
		b=ip.nextInt();
		System.out.println("*********************MENU***********************");
		System.out.println("\n1.add\n2.sub\n3.multiply\n4.divide\n");
		System.out.println("enter your choice");
		int choice=ip.nextInt();
		switch(choice)
		{
			case 1:System.out.println("a+b="+(a+b));
			break;
			case 2:System.out.println( "a-b="+(a-b));
			break;
			case 3:System.out.println("a*b="+(a*b));
			break;
			case 4:System.out.println("a/b="+(a/b));
		}
	}
}
		