// File: displayADisplay.java
// Date: 9/8/12

import javax.swing.*;

public class displayADialog

{
	public static void main(String[] args)
	{
 		System.out.println("'Hello World!' Displayed via GUI warning box.");
		JOptionPane.showMessageDialog(null, "Hello World!", "Sample", JOptionPane.WARNING_MESSAGE);
		
		System.exit(0);
	}
}
