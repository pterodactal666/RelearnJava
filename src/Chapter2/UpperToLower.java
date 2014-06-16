package Chapter2;

import javax.swing.*;

/**
 * Created by Andrew on 17-Jun-14.
 * This program converts an uppercase character to a lowercase character in literals
 */
public class UpperToLower
{
	public static void main(String[] args)
	{
		char uppercase = 'K';
		int offset = (int)'a' - (int)'A';
		char lowercase = (char)((int)uppercase + offset);
		JOptionPane.showMessageDialog(null, String.format("The lowercase letter of %c is %c", uppercase, lowercase), "Exercise 2.7 Output", JOptionPane.INFORMATION_MESSAGE);
	}
}
