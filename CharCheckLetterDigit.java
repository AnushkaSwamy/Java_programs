import java.util.Scanner;

public class CharCheckLetterDigit
{
	public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a Character");
			char a =sc.next().charAt(0);
			boolean ret= Character.isLetterOrDigit(a);

			if(ret)
			{
				if(Character.isLetter(a))
			    {
					System.out.println(a+" is a character.");
				}
				else
				{
					System.out.println(a+" is a digit.");
				}
			}
			else
			{
				System.out.println(a+" is not a character or a digit");
			}

	}
} 