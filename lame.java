// J. Gavin Ray 9/12
// ProgFourTen
// QuickTest Program 4.10 on Page 216 of Object-Oriented Program Development Using JAVA
// And #10 on page 222
// By Gary J. Bronson

import java.text.*;
import javax.swing.*;

public class lame
{

    public static void main(String[] args)
    {
        
        String s1;
        double num1, x, y;
        double x1 = 3, x2 = 7, y1 = 8, y2 = 12;   // Exercise #10
        
        DecimalFormat num = new DecimalFormat(",###.00");
        
        System.out.println("Displayed GUI Input for Number #1");        // Added by me
        s1 = JOptionPane.showInputDialog("Enter a number:");            // Added by me
        num1 = Double.parseDouble(s1);
        System.out.println("Number #1 Received with value of " + num1); // Added by me
        
        System.out.println("Displayed GUI output for formatted number: " + num.format(num1)); // Added by me

        JOptionPane.showMessageDialog(null, "The formatted number: " + num.format(num1),"Program 4.10 Page 216", JOptionPane.INFORMATION_MESSAGE);

        // Exercise #10
        x = (x1 + x2) / 2;
        y = (y1 + y2) / 2;
        
        JOptionPane.showMessageDialog(null, "The x coordinate of the midpoint is: " + num.format(x),"Exercise #10 Page 222 (X)", JOptionPane.INFORMATION_MESSAGE);
        System.out.println("The x coordinate of the midpoint is: " + num.format(x));
        JOptionPane.showMessageDialog(null, "The y coordinate of the midpoint is: " + num.format(y),"Exercise #10 Page 222 (Y)", JOptionPane.INFORMATION_MESSAGE);
        System.out.println("The y coordinate of the midpoint is: " + num.format(y));
        
        System.out.println("All done, sick of this assignment!");
        System.exit(0);

    }
}