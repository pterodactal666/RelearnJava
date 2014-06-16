package Chapter2;

import javax.swing.*;

/**
 * Created by Andrew on 16-Jun-14.
 * This program reads a weight in pounds from a input dialog box and displays the kilograms conversion
 */
public class C2E4PoundsToKilograms
{
	public static void main(String[] args)
	{
		//Get weight from user
		String input = JOptionPane.showInputDialog(null, "Enter weight in pounds:", "Exercise 2.4 Input", JOptionPane.QUESTION_MESSAGE);

		//Convert input string to weight double
		double pounds = Double.parseDouble(input);

		//Calculate weight in kilograms and format to 2 decimal places
		double kilograms = pounds * 0.454;
		kilograms = (int)(kilograms * 100) / 100.0;

		//Generate result string and output
		String output = pounds + " feet is " + kilograms + " meters.";
		JOptionPane.showMessageDialog(null, output, "Exercise 2.4 Output", JOptionPane.INFORMATION_MESSAGE);
	}
}
