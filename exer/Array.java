import java.io.*;
import java.util.Scanner;
class Array
{
	public static void main(String args[]) throws IOException
	{
		int a[][];
		Scanner ip=new Scanner(System.in);//class for reading data from keyboard
		System.out.print("enter the number of elements in the array");
		int r=ip.nextInt();//reds the value for rows
		int c=ip.nextInt();//reads the number of coloumns
		a=new int[r][c];//dynamic initialistion for array
		System.out.print("enter the array elements");
		for(int i=0;i<r;i++)//loop for reading array elements using for
		{
			for(int j=0;j<c;j++)
				a[i][j]=ip.nextInt();
		}
		for(int i=0;i<r;i++)//displays the array elements
		{
			for (int j=0;j<c;j++)
			{
				
				System.out.print(a[i][j]+" ");
			}
		System.out.println();
		}
	}
}
		
		
			