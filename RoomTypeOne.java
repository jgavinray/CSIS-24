// J. Gavin Ray
// Program 3.2

public class RoomTypeOne
{

	private double length;
	private double width;
	private double height;

	public RoomTypeOne()
	{
		length = 25.0;
		width  = 12.0;
		height = 10.0;		// Added by me

		System.out.println("Creatd a new room object using the default constructor.\n");
	}

	

	public void showValues()
	{
		System.out.println("Length = " + length + "\nWidth = " + width);
	}


	public void setNewValues(double len, double wid)
	{

		length = len;
		width  = wid;
	}

	
	public void calculateArea()
	{
		System.out.println(length * width);
	}


	// Added by me
	public void calculateVolume()
	{
		System.out.println("Total volume is: " + length * width * height);
	}

	public static void main(String[] args)
	{

		RoomTypeOne roomOne;

		roomOne = new RoomTypeOne();

		System.out.println("\nThe values for this room are: ");
		roomOne.showValues();

		System.out.println("The floor are of this room is: ");
		roomOne.calculateArea();

		roomOne.setNewValues(6.2, 3.5);

		System.out.println("\nThe values for this room have been changed to: ");
		roomOne.showValues();
		System.out.println("The floor area of this room is: ");
		roomOne.calculateArea();
		roomOne.calculateVolume();	// Added by me
	}
}
