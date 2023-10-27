import java.util.*;
class DoubleArrayList
{
	public static void main(String[] args)
	{
	 	 ArrayList<Double> arr = new ArrayList<>();
	 	 Scanner sc= new Scanner(System.in);
	 	 System.out.println("Enter no of elements you want to add in ArrayList");
	 	 double num=sc.nextDouble();

	 	 for(int i=1;i<=num;i++)
	 	 {
	 	 	System.out.println("Enter "+i+ "number");
	 	 	double a=sc.nextDouble();
	 	 	arr.add(a);
	 	 }

	 	 for (int i=0; i<arr.size();i++){

            System.out.println(" Element  at "+ i + " is => "+arr.get(i));

        }
	}
}