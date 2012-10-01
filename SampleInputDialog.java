// J. Gavin Ray 9/12
// SampleInputDialog.java
// Sample Program 4.3 on Page 196 of Object-Oriented Program Development Using JAVA
// By Gary J. Bronson

import javax.swing.*;

public class SampleInputDialog
{
    public static void main(String[] args)
    {
        String s1, s2;
        double num1, num2, average;
        
        System.out.println("Displayed GUI Input for Number #1");        // Added by me
        s1 = JOptionPane.showInputDialog("Enter a number:");
        num1 = Double.parseDouble(s1);
        System.out.println("Number #1 Received with value of " + num1); // Added by me
        System.out.println("Displayed GUI Input for Number #2");        // Added by me
        s2 = JOptionPane.showInputDialog("Enter a number:");
        num2 = Double.parseDouble(s2);
        System.out.println("Number #2 Received with value of " + num2); // Added by me
        
                
        average = (num1 + num2) / 2.0;
        
        System.out.println("Displayed GUI output for average of " + num1 + " and " + num2 + " is " + average); // Added by me
        JOptionPane.showMessageDialog(null, "The average of " + num1 + " and " + num2 + " is " + average,"Sample Input Program page 196", JOptionPane.INFORMATION_MESSAGE);
        
        System.exit(0);
    }
}