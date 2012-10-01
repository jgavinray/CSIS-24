// J. Gavin Ray 9/12
// QuickProgFourFour.java
// Exercise 2 on Page 204 of Object-Oriented Program Development Using JAVA
// By Gary J. Bronson

import java.text.*;
import javax.swing.*;

public class QuickProgFourFour
{
    public static void main (String[] args)
    {
        String fahr, output;
        double tempfahr, celsius;
        DecimalFormat df = new DecimalFormat("###.##");
        
        fahr = JOptionPane.showInputDialog("Enter a Fahrenheit Temperature:");
        
        tempfahr = Double.parseDouble(fahr);
        celsius = 5.00/9.00 * (tempfahr - 32);
        
        output = "The equivalent Celsius tempature for " + df.format(tempfahr) + " degrees Fahrenheit is " + df.format(celsius);
        System.out.println("Displayed in GUI: " + output);
        JOptionPane.showMessageDialog(null, output, "QuickTest Program 4.4", JOptionPane.INFORMATION_MESSAGE);
        System.out.println(output);
        
        System.exit(0);
    }
}