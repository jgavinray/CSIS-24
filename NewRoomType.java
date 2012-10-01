// J. Gavin Ray
// Program 3.1

public class NewRoomType
{
	// Data declarations section
	private double length;
	private double width;


	public NewRoomType() // Constructor
	{
		length = 25.0;
		width = 12.0;
		System.out.println("Created a new room object using the default constructor.\n");
	}

	

	public void showValues()
	{
		System.out.println("Length = " + length + "\nWidth = " + width);
	}


	public void setNewValues()
	{
		length = 12.5;
		width = 9.0;
	}

	
	public void calculateArea()
	{
		System.out.println(length * width);
	}

}
