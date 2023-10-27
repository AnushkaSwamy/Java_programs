import java.util.Scanner;

public class LowerCaseConvert {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char a = sc.next().charAt(0);
        boolean ret = Character.isLetter(a);

        if (ret) {
            char b = Character.toLowerCase(a);
            System.out.println(a + " converted to lower case is: "+b);
        } else {
            System.out.println("You did not enter a character");
        }

        
    }
}
