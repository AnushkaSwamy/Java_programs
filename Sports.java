import java.util.Scanner;

class Sports
{
	long s_code;
	String s_name;
	int fees;
	int duration;

	public void Sports()
	{
		s_code=1001;
		s_name="Cricket";
		fees=500;
		duration=70;
	}

	public void newSports()
	{
     	Scanner sc = new Scanner(System.in);
     	System.out.println(" Enter sports code ");
     	s_code= sc.nextLong();
        System.out.println(" Enter sports name ");
     	s_name= sc.next();
     	System.out.println(" Enter duration ");
     	duration= sc.nextInt();

     	switch(s_name)
     	{
            case "Table Tennis":
                fees = 2000;
                System.out.println("Fees for table tennis is 2000");
                break;
            case "Swimming":
                fees = 4000;
                System.out.println("Fees for swimming is 4000");
                break;
            case "Football":
                fees = 3000;
                System.out.println("Fees for football is 3000");
                break;
            default:
                System.out.println("Invalid sports name.");
                
        }   

	}

	public void displaySports() 
    {
        System.out.println("Sports Code: " + s_code);
        System.out.println("Sports Name: " + s_name);
        System.out.println("Fees: " + fees);
        System.out.println("Duration: " + duration + " days");
    }

    public static void main(String[] args)
    {
       Sports sports=new Sports();
       sports.newSports();
       sports.displaySports();
    }
}





   
