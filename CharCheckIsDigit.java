import java.util.Scanner;

public class CharCheckIsDigit
{
	public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a Character");
			char a =sc.next().charAt(0);
			boolean ret= Character.isDigit(a);

			if(ret)
			{
				System.out.println(a+" is not a character.");
			}
			else
			{
				System.out.println(a+" is a character.");
			}

	}
} 