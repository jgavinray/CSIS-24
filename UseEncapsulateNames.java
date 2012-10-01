// J. Gavin Ray 9/12
// EncapulateNames
// Program 3.7 page 156 of Object-Oriented Program Development Using JAVA
// By Gary J. Bronson

public class UseEncapsulateNames
{
    public static void main(String[] args)
    {
        String firstName = "Billings";
        String secName = "Ajax";
        EncapsulateNames namePair;  // Declare an object type
        
        namePair = new EncapsulateNames(firstName, secName);
        
        // Verify the accessors
        System.out.println("The first name is " + namePair.getFirst());
        System.out.println("The second name is " + namePair.getSecond());
        
        // Verify the mutators
        
        namePair.setAName("Gavin");
        namePair.setBName("Alex");

        System.out.println("\nAfter the Mutators:");
        System.out.println("The first name is " + namePair.getFirst());
        System.out.println("The second name is " + namePair.getSecond());

        
    }
}