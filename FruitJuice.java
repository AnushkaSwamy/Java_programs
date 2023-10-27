import java.util.Scanner;

class FruitJuice {
    int product_code;
    String flavour;
    String pack_type;
    int pack_size;
    int product_price;

    public FruitJuice() {
        product_code = 0;
        flavour = "";
        pack_type = "";
        pack_size = 0;
        product_price = 0;
    }


    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product code: ");
        product_code = sc.nextInt();
        System.out.println("Enter flavour: ");
        flavour = sc.next();
        System.out.println("Enter pack type: ");
        pack_type = sc.next();
        System.out.println("Enter pack size  ");
        pack_size = sc.nextInt();
        System.out.println("Enter product price: ");
        product_price = sc.nextInt();
    }

    
    public void discount() {
        product_price -= (product_price - 10);
    }

    
    public void display() {
        System.out.println("Product Code: " + product_code);
        System.out.println("Flavour: " + flavour);
        System.out.println("Pack Type: " + pack_type);
        System.out.println("Pack Size: " + pack_size + "ml");
        System.out.println("Product Price: " + product_price);
    }

    public static void main(String[] args) {
        FruitJuice juice = new FruitJuice();
        juice.input();
        juice.discount();
        juice.display();
    }
}
