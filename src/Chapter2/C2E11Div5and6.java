package Chapter2;

import javax.swing.*;

/**
 * Created by Andrew on 17-Jun-14.
 * This program takes integer from user and displays its divisibility by 5 and 6
 */
public class C2E11Div5and6
{
	public static void main(String[] args)
	{
		//Get input
		int input = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Integer:", "Exercise 2.11 Input",
		JOptionPane.QUESTION_MESSAGE));

		//Do divisibility checks
		boolean divisBoth = (input % 5 == 0 && input % 6 == 0);
		boolean divisOne = (input % 5 == 0 || input % 6 == 0);
		boolean divisExclu = (input % 5 ==0 ^ input % 6 == 0);

		//Format and output
		String output = String.format("Is %d divisible by 5 and 6? %b\nIs %d divisible by 5 or 6? %b\nIs %d divisible by 5 or 6, but not both? %b", input, divisBoth, input, divisOne, input, divisExclu);
		JOptionPane.showMessageDialog(null, output, "Exercise 2.11 output", JOptionPane.INFORMATION_MESSAGE);
	}
}
