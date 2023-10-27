public class Friend
{
	String name;
	String address;
	String favHobby;

	public void Friend(String name, String address, String favHobby)
	{
	 	this.name=name;
	 	this.address=address;
	 	this.favHobby=favHobby;
	}

	public void display()
	{
		System.out.println("Name :"+name);
		System.out.println("Address : "+address );
		System.out.println("Favourite Hobby : "+favHobby);
	}

	public static void main(String[] args)
	{
	  	Friend friend1 = new Friend(Sagarika,Vanowdi,Acting);
	  	System.out.println("++++++++++++++++++");
	  	friend1.display();
	  	System.out.println("++++++++++++++++++");

	  	Friend friend2 = new Friend(Chealsi,Camp,Swimming);
	  	System.out.println("++++++++++++++++++");
	  	friend1.display();
	  	System.out.println("++++++++++++++++++");

	}
}