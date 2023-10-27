public class Box
{
	int length;
	int breadth;
	int height;

	public void box(int length,int breadth, int height)
	{
	    this.length = length;
        this.breadth = breadth;
        this.height = height;
	}

	public void DisplayVolume()
	{
	   int volume = length*breadth*height;
	   System.out.println("Volume of box is: "+volume);
	}

	public static void main(String[] args)
	{
       Box box = new Box(10,6,4);
       box.DisplayVolume();
	}
}