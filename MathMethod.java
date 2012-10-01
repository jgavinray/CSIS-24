// J. Gavin Ray 9/12
// MathMethod
// Exercise #16 on Page 233 of Object-Oriented Program Development Using JAVA
// By Gary J. Bronson

import java.lang.Math;

public class MathMethod
{
    public static void main(String[] args)
    {
        String a = "15";
        String b = "14";
        double a1;
        double b1;
        double average;
        System.out.println("A = " + a);
        System.out.println("B = " + b);

        a1 = Double.parseDouble(a);
        b1 = Double.parseDouble(b);
        
        average = (a1 + b1) / 2;
        
        System.out.println("Average equals: " + average);
        System.exit(0);
    }

    
}