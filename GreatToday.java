// J. Gavin Ray 9/12
// GreatToday
// Exercise #10 on Page 257 of Object-Oriented Program Development Using JAVA
// By Gary J. Bronson

import java.io.*;
import javax.swing.*;

public class GreatToday
{
    public static void main(String[] args)
    throws java.io.IOException
    {
        String s1;
        int num;
    
        System.out.println("Displaying in GUI: If today is a Great Day Enter '1' otherwise enter '2':");
        s1 = JOptionPane.showInputDialog("If today is a Great Day Enter '1' otherwise enter '2':");
        num = Integer.parseInt(s1);
        System.out.println("Received value of " + num);
        
        if (num == 1)
        {
            System.out.println("Displaying to GUI: Today is a Great Day!");
            JOptionPane.showMessageDialog(null, "Today is a Great Day!","Exercise #10 Page 257", JOptionPane.INFORMATION_MESSAGE);
        }
        else if (num == 2)
        {
            System.out.println("Displaying to GUI: I feel down today #$*!");
            JOptionPane.showMessageDialog(null, "I feel down today #$*!","Exercise #10 Page 257", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            System.out.println("Displaying to GUI: Invalid entry, exiting program!");
            JOptionPane.showMessageDialog(null, "Invalid entry, exiting program!","Exercise #10 Page 257", JOptionPane.WARNING_MESSAGE);
        }
    }
}
