// J. Gavin Ray 9/12
// InteractiveKeyboard.java
// Exercise 4.1 #6 on Page 193 of Object-Oriented Program Development Using JAVA
// By Gary J. Bronson

import java.io.*;

public class InteractiveKeyboard
{
    private double length;
    private double width;
    
    public void InteractiveKeyboard()   // Constructor
    {
        length = 1;
        width = 1;
    }
    
    public void setLength(double len)   // Mutator
    {
        length = len;
    }
    
    public void setWidth(double wid)    // Mutator
    {
        width = wid;
    }
    
    public double calcArea()              // Accessor/Calc
    {
        return (length * width);
    }
    

    public static void main(String[] args)
    throws java.io.IOException
    {
        String lengthToBeInterpreted;
        String widthToBeInterpreted;
        double length;
        double width;
        
        // This type of stuff sucks when learning a new language.  As memorizing the libraries can be a pain.
        // Init of Objects
        InputStreamReader InputStream = new InputStreamReader(System.in);
        BufferedReader Read = new BufferedReader(InputStream);
        InteractiveKeyboard NewArea = new InteractiveKeyboard(); // My stuff not the libraries
        // End Init
        
        System.out.println("Please enter a number:");
        lengthToBeInterpreted = Read.readLine();
        NewArea.setLength(Double.parseDouble(lengthToBeInterpreted));
        
        System.out.println("Please enter a number:");
        widthToBeInterpreted = Read.readLine();
        NewArea.setWidth(Double.parseDouble(widthToBeInterpreted));
        
        
        System.out.println("Total Area is: " + NewArea.calcArea());

    }

}