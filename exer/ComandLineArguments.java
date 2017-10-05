import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
class ComandLineArguments
{
	public static void main(String args[])
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//Scanner ip=new Scanner(System.in);
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[2]);
		char op=args[1].charAt(0);
		//int n=args.length;
		/*System.out.println("the number of arguments that are passed are:"+n);
		for(int i=0;i<n;i++)
		{
			System.out.println(args[i]);
		}*/
			switch(op)
		{
			case '+':System.out.println("sum is"+(a+b));
			break;
			case '-':System.out.println("diff is"+(a-b));
			break;
		}
		
	}
}