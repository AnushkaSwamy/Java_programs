import java.util.Scanner;

public class CaseConverter {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char a = sc.next().charAt(0);
        boolean ret = Character.isLetter(a);
        System.out.println("Enter your choice\n1] Enter 1 to convert it to upper case\n2] Enter 2 to convert it to lower case");
        int n = sc.nextInt();

        if (ret) {
            if(n==1)
            {
                char b = Character.toUpperCase(a);
                System.out.println(a + " converted to upper case is: "+b);
            }
            else
            {
                char c = Character.toLowerCase(a);
                System.out.println(a + " converted to lower case is: "+c);
            }
        } else {
            System.out.println("You did not enter a character");
        }

        
    }
}
