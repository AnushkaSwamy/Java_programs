import java.util.*;
class CharArrayList
{
	public static void main(String[] args)
	{
	 	 ArrayList<Character> arr = new ArrayList<>();
	 	 Scanner sc= new Scanner(System.in);
	 	 System.out.println("Enter no of elements you want to add in ArrayList");
	 	 int num=sc.nextInt();

	 	 for(int i=1;i<=num;i++)
	 	 {
	 	 	System.out.println("Enter "+i+ "Character");
	 	 	char a=sc.next().charAt(0);
	 	 	arr.add(a);
	 	 }

	 	 for (int i=0; i<arr.size();i++){

            System.out.println(" Element  at "+ i + " is => "+arr.get(i));

        }
	}
}