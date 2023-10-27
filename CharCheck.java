import java.util.Scanner;

public class CharCheck {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char a = sc.next().charAt(0);
        boolean ret = Character.isLetter(a);

        if (ret) {
            System.out.println(a + " is a Character.");
        } else {
            System.out.println(a + " is not a Character.");
        }

        
    }
}
