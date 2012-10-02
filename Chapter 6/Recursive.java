// J. Gavin Ray 10/12
// Recursive
// Exercise #2 on Page 342 of Object-Oriented Program Development Using JAVA
// By Gary J. Bronson


public class Recursive
{
    public static void main(String[] args)
    {
        int n = 40;
        long result;
        
        result = sum(n);
        System.out.println("The sum of " + n + " is " + result);
    }
    
    public static long sum(int n)
    {
        if (n == 1)
            return (n);
        else
            return n + sum(n-1);
    }
}