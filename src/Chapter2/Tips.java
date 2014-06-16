package Chapter2;

import javax.swing.*;

/**
 * Created by Andrew on 16-Jun-14.
 * This program reads the subtotal and granuity from input and calculates the appropriate tips
 */
public class Tips
{
	public static void main(String[] args)
	{
		//Get subtotal
		String input = JOptionPane.showInputDialog(null, "Enter subtotal:", "Exercise 2.5 Input Subtotal", JOptionPane.QUESTION_MESSAGE);

		//Convert subtotal string to double
		double subtotal = Double.parseDouble(input);

		//Get granuity percent
		input = JOptionPane.showInputDialog(null, "Enter granuity as a percentage:", "Exercise 2.5 Input Granuity", JOptionPane.QUESTION_MESSAGE);

		//Convert granuity percent string to double
		double granuityPercent = Double.parseDouble(input);

		//Calculate granuity amount and total and format
		double granuityAmount = subtotal * (granuityPercent / 100);
		double total = subtotal + granuityAmount;

		//Generate result string and output
		String output = String.format("The granuity is $%1.2f\nThe total is $%1.2f", granuityAmount, total);
		JOptionPane.showMessageDialog(null, output, "Exercise 2.5 Output", JOptionPane.INFORMATION_MESSAGE);
	}
}
