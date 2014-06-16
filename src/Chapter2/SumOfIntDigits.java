package Chapter2;

import javax.swing.*;

/**
 * Created by Andrew on 16-Jun-14.
 * This program reads an Integer from input and calculates the sum of it's digits.
 */
public class SumOfIntDigits
{
	public static void main(String[] args)
	{
		//Get and convert Integer
		int input = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Integer between 0 and 1000:", "Exercise 2.6 Input", JOptionPane.QUESTION_MESSAGE));

		//Calculate sum of digits
		int total = input % 10;     //units
		int working = input / 10;
		total += working % 10;        //tens
		working = working / 10;
		total += working % 10;        //hundreds
		working = working / 10;
		total += working % 10;        //one thousand

		//Format and output the result
		JOptionPane.showMessageDialog(null, String.format("The sum of the digits in %d is %d", input, total), "Exercise 2.6 Output", JOptionPane.INFORMATION_MESSAGE);
	}
}
