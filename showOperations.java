// J. Gavin Ray
// Program: 2.1
// Date:  9/8/12

public class showOperations
{

	public static void main(String[] args)
	{
		System.out.println("15.0 plus 2.0 equals " + (15.0 + 2.0) + '\n'
					+ "15.0 minus 2.0 equals " + (15.0 - 2.0) + '\n'
					+ "15.0 times 2.0 equals " + (15.0 * 2.0) + '\n'
					+ "15.0 divided by 2.0 equals " + (15.0 / 2.0) + '\n' );

	// From here on is Exercise 2.1 #16

	// Like in C and other languages there is an order of operations when using multiple
	// operands in a equation.  Multiply/Divide happens first, followed by Plus/Minus
	// exceptions to this are when parenthesis are involved, in which case whatever is
	// in parenthesis happens first.  ()s can also be nested within one another for exceptionaly
	// complex formulas.  This is how high level formulas are done using computers.

		System.out.println("Formulas from Exercise 2.1 #16:\n" 
				+"3.0 * 5.0 = " + (3.0 * 5.0) + '\n'	
				+ "7.1 * 8.3 - 2.2 = " + (7.1 * 8.3 - 2.2) + '\n'
				+ "3.2 / (6.1 * 5) = " + (3.2 / (6.1 * 5)) + '\n'		
				+ "J. Gavin Ray");

	}
}

