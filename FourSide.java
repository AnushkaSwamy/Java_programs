public class FourSide
{
	int length;
	int breadth;

	public void FourSide(int squareside)
	{
	 	this.length=squareside;
	 	this.breadth=squareside;
	}

	public void FourSide(int length, int breadth)
	{
	 	this.length=length;
	 	this.breadth=breadth;
	}

	public void display()
	{
		int area = length * breadth;
		System.out.println("Area : "+area);
	}

	public static void main(String[] args)
	{
	  	FourSide fourside1 = new FourSide(7);
	  	System.out.println("+++++++++ Square +++++++++");
	  	fourside1.display();
	  	System.out.println("++++++++++++++++++");

	  	FourSide fourside2 = new FourSide(10,6);
	  	System.out.println("+++++++++ Rectangle +++++++++");
	  	fourside2.display();
	  	System.out.println("++++++++++++++++++");
	}
}