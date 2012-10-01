// J. Gavin Ray 9/12
// EncapulateNames
// QuickTest Program 4.1 on Page 184 of Object-Oriented Program Development Using JAVA
// By Gary J. Bronson

import java.io.*;       // Needed to access input stream classes
import javax.swing.*;    // GUI


public class ForOne
{

    public static void main(String[] args)
    throws java.io.IOException
    {
        String s1;
        String s2;
        double num1, num2, product;
        
        // Basic input stream
        InputStreamReader isr = new InputStreamReader(System.in);
        
        // Needed for readLine()
        BufferedReader br = new BufferedReader(isr);
        
        System.out.print("Enter a number: ");
        s1 = br.readLine();
        num1 = Double.parseDouble(s1);
        
        System.out.print("Enter another number: ");
        s2 = br.readLine();
        num2 = Double.parseDouble(s2);
        
        product = num1 * num2;
        System.out.println(num1 + " times " + num2 + " equals: " + product);

//        .  ."|
//        /| /  |  _.----._
//        . |/  |.-"        ".  /|
//        /                    \/ |__
//        |           _.-"/        /
//        "   |       _.-""     /."""|
//        ".__.-"         "  |     \
//        |              |       |
//        /_      _.._   | ___  /
//        ."  """-.-"    ". |/.-.\/
//        |    0  |    0  |     / |
//        \      /\_     _/    "_/
//        "._ _/   "---"       |
//        /"                 |
//        \__.--                |_
//        )          .        | ".
//        /        _.-"\        |  ".
//        /     _.-"             |    ".
//        (_ _.-|                  |     |""""-._.
//         "    "--.             .J     _.-'
//         /\        _.-" | _.-'
//         /  \__..--"   _.-'
//         /   |      _.-'
//         /| /\|  _.-'
         
        JOptionPane.showMessageDialog(null, num1 + " times " + num2 + " equals: " + product, "Program 4.1 Page 184", JOptionPane.WARNING_MESSAGE); // Added by the guy above!

        
        
        System.out.println("Answer also displayed to GUI");
    
    }
}