import java.util.*;
class FloatArrayList
{
	public static void main(String[] args)
	{
	 	 ArrayList<Float> arr = new ArrayList<>();
	 	 Scanner sc= new Scanner(System.in);
	 	 System.out.println("Enter no of elements you want to add in ArrayList");
	 	 float num=sc.nextFloat();

	 	 for(int i=1;i<=num;i++)
	 	 {
	 	 	System.out.println("Enter "+i+ "number");
	 	 	float a=sc.nextFloat();
	 	 	arr.add(a);
	 	 }

	 	 for (int i=0; i<arr.size();i++){

            System.out.println(" Element  at "+ i + " is => "+arr.get(i));

        }
	}
}