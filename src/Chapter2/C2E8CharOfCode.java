package Chapter2;

import javax.swing.*;

/**
 * Created by Andrew on 17-Jun-14.
 * This program reads an int from the user and outputs the corresponding ASCII character
 */
public class C2E8CharOfCode
{
	public static void main(String[] args)
	{
		//Get the int for the character
		int input = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter ASCII code:", "Exercise 2.8 Input", JOptionPane.QUESTION_MESSAGE));

		//Convert to char
		char output = (char) input;

		//Output
		JOptionPane.showMessageDialog(null, String.format("ASCII character %d is %c", input, output), "Exercise 2.8 Output", JOptionPane.INFORMATION_MESSAGE);
	}
}
