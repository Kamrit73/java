import java.util.Scanner;
import java.lang.*;
class StringSort
{
	public static void main(String args[])
	{
		int n;
		String temp;
		Scanner ip=new Scanner(System.in);
		
		System.out.println("enter the number of names");
		 n=ip.nextInt();
		 String names[]=new String[n];
		for(int i=1;i<n;i++)
		{ 
			names[i]=ip.nextLine();
		}
		for(int i=1;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(names[i].compareTo(names[j])>0)
				{
					temp=names[i];
					names[i]=names[j];
					names[j]=temp;
				}
			}
		}
		System.out.println("names in sorted list are");
		for(int i=0;i<n-1;i++)
		{
			System.out.println(names[i]+",");
		}
		System.out.println(names[n-1]);
	}
}