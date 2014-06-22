package Chapter3;

import javax.swing.*;

/**
 * Created by Andrew on 22-Jun-14.
 * This program uses a loop to calculate the tuition increase over 10 years
 */
public class C3E12TuitionIncrease
{
	public static void main(String[] args)
	{
		//Initial setup
		int cost = 10000;

		//Calculation
		for(int i = 0; i < 10; i++)
		{
			cost += cost * 0.05;
		}

		//Output
		JOptionPane.showMessageDialog(null, "The tuition in 10 years is $" + cost, "Exercise 3.12 Output", JOptionPane.INFORMATION_MESSAGE);
	}
}
