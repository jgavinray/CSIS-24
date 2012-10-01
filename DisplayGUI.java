// J. Gavin Ray 9/12
// Display GUI
// The purpose of this class is to quickly set and display Strings
// both at the command line and in the GUI using an information message.
// Quicker and easier toshoot strings off instead of writing out ungodly
// amountof code

import java.io.*;
import javax.swing.*;

public class DisplayGUI
{
    private String string;
    private String header;
    
    public void DisplayGUI()
    {
        string = "Empty";
        header = "Empty";
    }
    
    public void setString(String s1)
    {
    string = s1;
    }
    
    public void setHeader(String h1)
    {
        header = h1;
    }
    
    public void input(double num)
    {
        System.out.println("Received input: " + num + " from GUI.");
    }
    
    public void input(String s1)
    {
      System.out.println("Received input: " + s1 + " from GUI.");
    }
    
    public void output()
    {
        System.out.println("Displaying in GUI: " + string);
        JOptionPane.showMessageDialog(null, string, header, JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void output(String s1)
    {
        System.out.println("Displaying in GUI: " + s1);
        JOptionPane.showMessageDialog(null, s1, header, JOptionPane.INFORMATION_MESSAGE);
        
    }
}
