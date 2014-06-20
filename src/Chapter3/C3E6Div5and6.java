package Chapter3;

import javax.swing.*;

/**
 * Created by Andrew on 20-Jun-14.
 * This program takes integer from user and displays its divisibility by 5 and 6
 */
public class C3E6Div5and6
{
	public static void main(String[] args)
	{
		//Get input
		int input = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Integer:", "Exercise 3.6 Input",
						JOptionPane.QUESTION_MESSAGE));

		String output;

		//Logic
		if(input % 5 == 0 && input % 6 == 0)
		{
			output = input + " is divisible both 5 and 6.";
		}
		else if(input % 5 == 0 || input % 6 == 0)
		{
			output = input + " is divisible by either 5 or 6.";
		}
		else
		{
			output = input + " is not divisible by either 5 or 6.";
		}

		//Output
		JOptionPane.showMessageDialog(null, output, "Exercise 3.6 Output", JOptionPane.INFORMATION_MESSAGE);
	}
}
