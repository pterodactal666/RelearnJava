package Chapter3;

import javax.swing.*;

/**
 * Created by Andrew on 20-Jun-14.
 * This program takes an unspecified number of inputs from user and counts the number of positive and negative, and the average
 */
public class C3E7PosNegAve
{
	public static void main(String[] args)
	{
		//Setup variables
		int input, number = 0, sum = 0, positive = 0, negative = 0;
		double average;

		//Get input and do on-the-fly checking
		do
		{
			input = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Integer:", "Exercise 3.7 Input", JOptionPane.QUESTION_MESSAGE));

			if(input == 0)
				break;

			number++;
			sum += input;

			if(input > 0)
				positive++;
			else if(input < 0)
				negative++;

		}while(input != 0);

		average = sum / (double) number;

		//Format and output
		String output = String.format("There were %d positive number, %d negative numbers, the total was %d and the average was %1.2f", positive, negative, sum, average);
		JOptionPane.showMessageDialog(null, output, "Exercise 3.7 Output", JOptionPane.INFORMATION_MESSAGE);
	}
}
