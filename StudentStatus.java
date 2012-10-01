// J. Gavin Ray 9/12
// StudentStatus
// Exercise #6 on Page 270 of Object-Oriented Program Development Using JAVA
// By Gary J. Bronson

import java.io.*;
import javax.swing.*;

public class StudentStatus
{
    public static void main(String[] args)
    throws java.io.IOException
    {
        String s1;
        String F = "Freshman";
        String S = "Sophomore";
        String JR = "Junior";
        String SR = "Senior";
        String MS = "Master's Program";
        String DR = "Doctoral Program";
        int code;
        DisplayGUI out = new DisplayGUI();
        
        s1 = JOptionPane.showInputDialog("Please enter your current year of study (1 - 6): ");
        code = Integer.parseInt(s1);
        
        switch (code)
        {
            case 1:
                out.input(s1);
                out.output(F);
                break;
            case 2:
                out.input(s1);
                out.output(S);
                break;
            case 3:
                out.input(s1);
                out.output(JR);
                break;
            case 4:
                out.input(s1);
                out.output(SR);
                break;
            case 5:
                out.input(s1);
                out.output(MS);
                break;
            case 6:
                out.input(s1);
                out.output(DR);
                break;
            default:
                out.input(s1);
                out.output("An invalid number was entered exiting program");
                break;
            
        }
                        System.exit(0);
    }
}

