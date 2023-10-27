import java.util.Scanner;

public class CharCaseConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char a = sc.next().charAt(0);
        boolean ret = Character.isLetter(a);

        try {

            
            if(ret)
            {
                System.out.println("Choose an option: \n 1. Convert to Uppercase \n 2. Convert to Lowercase");
                int b = sc.nextInt();

                switch (b) 
                {
                    case 1:
                        char upperChar = Character.toUpperCase(a);
                        System.out.println("Character in uppercase: " + upperChar);
                        break;
                    case 2:
                        char lowerChar = Character.toLowerCase(a);
                        System.out.println("Character in lowercase: " + lowerChar);
                        break;
                    default:
                        System.out.println("Invalid option. Please enter 1 for uppercase or 2 for lowercase.");
                        break;
                }
            }
            else{
                System.out.println("Invalid input. Enert a character");
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid option (1 or 2).");
        } 
    }
}
