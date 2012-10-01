public class TestSwap
{
    public static void main(String[] args)
    {
        String firstName = "Billings";  // Here is the current first name
        String secName = "Ajax";         // Here is the current second Name
        EncapsulateNames namePair;
        
        System.out.println("Before the call to swap()");
        System.out.println("    The String stored in firstName is: " + firstName);
        System.out.println("    The String stored in secName is: " + secName);
        
        // Enclose the two strings within a single object
        namePair = new EncapsulateNames(firstName, secName);
        
        // Swap the string values within the object
        namePair.swap();    // Apply the swap() method to the object
        
        // Now extract the two strings
        firstName = namePair.getFirst();
        secName = namePair.getSecond();
        
        System.out.println("\nAfter the call to swap():");
        System.out.println("    The String stored in firstName is now: " + firstName);
        System.out.println("    The String stored in secName is now: " + secName);
        
    }
}