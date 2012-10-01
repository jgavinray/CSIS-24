public class RoomType
{
	//data declaration section
	private double length;  //declare length as a double variable
	private double width;  //declare width as a double variable

	//method definitions section
	public RoomType()     //this is a constructor
	{
		length = 25.0;
		width = 10.0;
		System.out.println("Created a new room object using the default constructor \n");
	}

	public void showValues() //this is a modified accessor
	{
		System.out.println("  length = "  + length +  "\n  width  = "  + width);
	}


	public void setNewValues(double len, double wid)  //this is a mutator  <------------!!!!
	{
		length = len;
		width = wid;
	}

	public void calculateArea()  //this performs a calculation
	{
		System.out.println(length*width);
	}

	public static void main(String[] args)
	{
		RoomType roomOne;  //declare a variable of type RoomType
		roomOne = new RoomType(); //create and initialize an object of type RoomType

		System.out.println("\n The values for this room are:");
		roomOne.showValues();  //use a class method on this object

		System.out.println("The floor area of this room is: ");
		roomOne.calculateArea();  //use another class method on this object

		roomOne.setNewValues(6.2, 3.5);//call the mutator <------------------------!!!

		System.out.println("\nThe values for this room have been changed to:");
		roomOne.showValues();

		System.out.println("The floor area of this room is: ");
		roomOne.calculateArea();

	}
}