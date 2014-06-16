package Chapter2;

import javax.swing.*;

/**
 * Created by Andrew on 16-Jun-14.
 * This program reads a length in Feet from a input dialog box and displays the meters convertion
 */
public class FeetToMeters
{
	public static void main(String[] args)
	{
		//Get radius from user
		String input = JOptionPane.showInputDialog(null, "Enter length in feet:", "Exercise 2.3 Input", JOptionPane.QUESTION_MESSAGE);

		//Convert input string to radius double
		double feet = Double.parseDouble(input);

		//Calculate length in meters and format to 2 decimal places
		double meters = feet * 0.305;
		meters = (int)(meters * 100) / 100.0;

		//Generate result string and output
		String output = feet + " feet is " + meters + " meters.";
		JOptionPane.showMessageDialog(null, output, "Exercise 2.3 Output", JOptionPane.INFORMATION_MESSAGE);
	}
}
