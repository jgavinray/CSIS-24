// J. Gavin Ray 10/12
// ForTable
// Exercise #2 on Page 331 of Object-Oriented Program Development Using JAVA
// By Gary J. Bronson

import java.text.*;
public class ForTable
{
    public static void main(String[] args)
    {
        int num;
        
        DecimalFormat df = new DecimalFormat("0000");
        // This object below saves so much typing...
        DisplayGUI out = new DisplayGUI();
        
        
        // Thought this exercise was boring so in addition to doing what it asked,
        // I added dual outputs utilizing 20% less code than whats in the book.
        // Cheers!  - Gavin
        for (num = 1; num < 11; num++)
        {
            out.setHeader("Exercise #2 on Page 331");
            out.setString("NUMBER\tSQUARE\tCUBE\n------\t------\t------\n" + df.format(num) + "\t" + df.format(num * num) + "\t" + df.format(num * num * num) + "\n");
            out.output();
            
        }
    }
}