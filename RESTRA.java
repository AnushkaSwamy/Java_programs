import java.util.Scanner;

class RESTRA 
{
    int FoodCode;
    String Food;
    String FType;
    String Sticker;

    private void GetSticker() {
        switch (FType)
         {
            case "vegetarian":
                Sticker = "GREEN";
                break;
            case "contains egg":
                Sticker = "YELLOW";
                break;
            case "non-vegetarian":
                Sticker = "RED";
                break;
            default:
                Sticker = "UNKNOWN";
        }
    }

    // Public method to allow user to enter values for FoodCode, Food, and FType
    public void GetFood() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Food Code: ");
        FoodCode = sc.nextInt();
        System.out.println("Enter Food: ");
        Food = sc.next();
        System.out.println("Enter FType ");
        FType = sc.next();
        GetSticker();
    }

    // Public method to display the content of all data members
    public void ShowFood() {
        System.out.println("Food Code: " + FoodCode);
        System.out.println("Food: " + Food);
        System.out.println("FType: " + FType);
        System.out.println("Sticker: " + Sticker);
    }

    public static void main(String[] args) {
        RESTRA  restra = new RESTRA();
        restra.GetFood();
        restra.ShowFood();
    }
}
