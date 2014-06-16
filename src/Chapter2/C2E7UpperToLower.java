package Chapter2;

import javax.swing.*;

/**
 * Created by Andrew on 17-Jun-14.
 * This program converts an uppercase character to a lowercase character in literals
 */
public class C2E7UpperToLower
{
	public static void main(String[] args)
	{
		//The character we are going to be working on
		char uppercase = 'K';

		//Calculate the difference between a lowercase and uppercase
		int offset = (int)'a' - (int)'A';

		//Calculate the lowercase
		char lowercase = (char)((int)uppercase + offset);

		//Output
		JOptionPane.showMessageDialog(null, String.format("The lowercase letter of %c is %c", uppercase, lowercase), "Exercise 2.7 Output", JOptionPane.INFORMATION_MESSAGE);
	}
}
