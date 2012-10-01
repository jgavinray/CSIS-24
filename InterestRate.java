// J. Gavin Ray 9/12
// InterestRate
// Exercise #2 on Page 263 of Object-Oriented Program Development Using JAVA
// By Gary J. Bronson

import java.io.*;
import javax.swing.*;

public class InterestRate
{
    public static void main(String[] args)
    throws java.io.IOException
    {
        String s1;
        String interest = "Your interest rate will be: ";

        double FiveYears = .0475;
        double FourYears = .045;
        double ThreeYears = .040;
        double TwoYears = .035;
        double OneYear = .030;
        double ZeroYear = .025;
        
        double num;
        
        DisplayGUI out = new DisplayGUI();
        
        s1 = JOptionPane.showInputDialog("Please enter the amount of time in years you wish to deposit your funds.");
        if (s1 == null)
        {
            out.output("Get a life loser.");
            System.exit(0);
        }
        num = Double.parseDouble(s1);
        
        if (num >= 5)
        {
            out.input(num);
            out.output(interest + FiveYears);
            
        }
        else if (num < 5 && num >= 4)
        {
            out.input(num);
            out.output(interest + FourYears);
        }
        else if (num < 4 && num >= 3)
        {
            out.input(num);
            out.output(interest + ThreeYears);
        }
        else if (num < 3 && num >= 2)
        {
            out.input(num);
            out.output(interest + TwoYears);
        }
        else if (num < 2 && num >= 1)
        {
            out.input(num);
            out.output(interest + OneYear);
        }
        else if (num < 1)
        {
            out.input(num);
            out.output(interest + ZeroYear);
        }
            
        
            System.exit(0);
    }
}