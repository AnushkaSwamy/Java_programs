import java.util.Scanner;

public class LowerCaseCheck {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char a = sc.next().charAt(0);
        boolean ret = Character.isLowerCase(a);

        if (ret) {
            System.out.println(a + " is  lower case.");
        } else {
            System.out.println(a + " is upper case.");
        }

        
    }
}
