public class UseRoomType
{
	public static void main(String[] args)
	{
		RoomType roomOne;	// Declare a variable of type RoomType

		roomOne = new RoomType();	// Create and init an object of
						// type RoomType

		System.out.println("Program 2.12 -\nThe values for this room are:");
		roomOne.showValues();		// Use a class method on this object
		System.out.println("\nThe floor area of this room is: ");
		roomOne.calculateArea();	// Use another class method on this object

		// Added by J. Gavin Ray

		System.out.println("\nThe volume of this room is: ");
		roomOne.calculateVolume();
	

		// Section 2.4 #11

		int sum;
		sum = 0;
		sum = sum + 96;
		sum = sum + 70;
		sum = sum + 85;
		sum = sum + 60;

		System.out.println("The value of sum is initially set to " + sum);
		System.out.println("	sum is now " + sum );
                System.out.println("    sum is now " + sum );
                System.out.println("    sum is now " + sum );
                System.out.println("    The final sum is " + sum );
	}
}
