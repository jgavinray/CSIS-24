// J. Gavin Ray 9/12
// EncapulateNames
// Program 3.5 page 155 of Object-Oriented Program Development Using JAVA
// By Gary J. Bronson

public class EncapsulateNames
{
    // Data declaration section
    private String nameOne;     // First name is referenced by this variable
    private String nameTwo;     // Second name is referenced by this variable
    
    // Method definitions
    public EncapsulateNames(String s1, String s2)    // Constructor
    {
        nameOne = s1;
        nameTwo = s2;
    }
    
    // Methods to get and set individual string values
    public String getFirst()
    {
        return nameOne;
    }
    
    public String getSecond()
    {
        return nameTwo;
    }
    
    public void setAName(String s1)
    {
        nameOne = s1;
    }
    
    public void setBName(String s2)
    {
        nameTwo = s2;
    }
    
    // Swap method added by the program 3.8 on page 158
    public void swap()
    {
        String temp;    // Declare a third variable for temp holding of a double

        temp = nameOne;        // Step 1. Store first variable to temp
        nameOne = nameTwo;     // Step 2. Store second variable to nameOne
        nameTwo = temp;        // Step 3. Load nameTwo with variable stored in temp
    }
}