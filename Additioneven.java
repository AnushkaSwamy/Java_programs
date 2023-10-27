import java.util.*;
class Additioneven
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int num=sc.nextInt();
		int arr[]=new int[num];

		int sum=0;
		for(int i=0;i<num;i++)
		{
			System.out.println("Enter number");
			arr[i]=sc.nextInt();
			if(i%2==0)
			{
				sum=sum+arr[i];
			}
		}
		System.out.println("++++Arraty data is++++");
		for(int i=0;i<num;i++)
		{
			int num1=arr[i];
			System.out.println("arr["+i+"] data is:"+num1);
		}
		System.out.println("addition of even numberis:"+sum);
	}
}