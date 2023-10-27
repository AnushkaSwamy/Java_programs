import java.util.*;
class ArrayAddition
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size ");
		int num=sc.nextInt();
		int arr[]=new int[num];
		
		int sum=0;
		for(int i=0;i<num;i++)
		{
			System.out.println("Enter number");
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		System.out.println("+++Array datais++++");
		for(int i=0;i<num;i++)
		{
			int num1=arr[i];
			System.out.println("arr["+i+"] data is:"+num1	);
		}
		System.out.println("Addition of 10 numbers="+sum);
	}
}