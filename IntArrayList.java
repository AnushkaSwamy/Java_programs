import java.util.*;
class IntArrayList
{
	public static void main(String[] args)
	{
	 	 ArrayList<Integer> arr = new ArrayList<>();
	 	 Scanner sc= new Scanner(System.in);
	 	 System.out.println("Enter no of elements you want to add in ArrayList");
	 	 int num=sc.nextInt();

	 	 for(int i=1;i<=num;i++)
	 	 {
	 	 	System.out.println("Enter "+i+ "number");
	 	 	int a=sc.nextInt();
	 	 	arr.add(a);
	 	 }

	 	 for (int i=0; i<arr.size();i++){

            System.out.println(" Element  at "+ i + " is => "+arr.get(i));

        }
	}
}