import java.util.Scanner; 
class ArrayException
{
	public static void main(String args[])
	{
		
		Scanner ip=new Scanner(System.in);
		int a[];
		a=new int[15];
		System.out.println("enter the address of the array");
		int n=ip.nextInt();
		System.out.println("enter the values to be inserted");
		int i=ip.nextInt();
		try{
			a[n]=i;
			System.out.println("value in position"+n+"is"+i);
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("exception caught"+e);
		System.out.println("Array index value -ve");
		
}
	}
}