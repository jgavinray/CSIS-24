// J. Gavin Ray 10/12
// doWhile
// Exercise #2 on Page 336 of Object-Oriented Program Development Using JAVA
// By Gary J. Bronson

import java.text.*;
import java.io.*;
import javax.swing.*;
import java.lang.String;


public class doWhile
{
    public static void main(String[] args)
    {
        
        String s1;
        double num;

        DisplayGUI out = new DisplayGUI();
        
        do
        {
            out.setHeader("Exercise #2 on Page 336");

            s1 = JOptionPane.showInputDialog("Please enter a number.");
            num = Integer.parseInt(s1);
            if (num >= 1 && num <= 100 || num == 999) {
                out.input(num);
                out.output(num);
                
            }
            if (num < 1 || num > 100 && num != 999)
            {
            out.input(num);
            out.output("Integer value is outside of specifid range!");
            }
            
        }
        while (num != 999);
        out.output(num + " is the correct integer to exit this loop!");
        
        
        
        
        System.exit(0);
    }
}
