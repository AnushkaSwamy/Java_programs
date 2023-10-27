import java.util.Scanner;

class Candidate
{
	long rno;
	String name;
    float score;
	String remark;

	private void AssignRem()
    {
        if(this.score >= 50)
        {
            this.remark="Selected";
        }
        else{
            this.remark=" Not Selected";
        }
    }

	public void EnterData()
	{
     	Scanner sc = new Scanner(System.in);
     	System.out.println(" Enter Registration number");
     	this.rno= sc.nextLong();
        System.out.println(" Enter name ");
     	this.name= sc.next();
     	System.out.println(" Enter score ");
     	this.score= sc.nextFloat();
        AssignRem();


	}

	public void displayData() 
    {
        System.out.println("Remark is " +this.remark);
    }

    public static void main(String[] args)
    {
       Candidate candidate = new Candidate();
       candidate.EnterData();
       candidate.displayData();
    }
}





   
