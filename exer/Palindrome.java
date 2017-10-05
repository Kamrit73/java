import java.util.Scanner;
class Palindrome
{
	public static void main(String args[])
	{
		Scanner ip=new Scanner(System.in);//object 
		String original,reverse="";
		System.out.println("enter the string");
		original=ip.next();
		int length=original.length();
		for(int i=length-1;i>=0;i--)
		{
			 reverse=reverse+original.charAt(i);
		}
		System.out.print("original srting is "+original+"\n");
		System.out.print("reversed srting is "+reverse+"\n");
		if(reverse.equals(original))
		{
			System.out.print("two strings are palindorme");
		}
		else
			System.out.print("two strings are not palindorme");
	}
}