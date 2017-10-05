import java.util.Scanner;
class NegativeArrayException
{
	public static void main(String args[])
	{
		Scanner ip=new Scanner(System.in);
	System.out.println("enter the array size");
	int n=ip.nextInt();
	try{
		int a[]=new int[n];
		System.out.println("Array size positive");
	}catch(NegativeArraySizeException e){
		System.out.println("Array size negative" +e+" for size"+n);
	}
	}
	
}
		
	