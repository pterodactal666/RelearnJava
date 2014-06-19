package Chapter3;

import javax.swing.*;

/**
 * Created by Andrew on 19-Jun-14.
 * This program computes the appropriate change for an input amount of money
 */
public class C3E1MonetaryUnits
{
	public static void main(String[] args)
	{
		//Get input
		int amount = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter amount in a integer, for example 1156", "Exercise 3.1 Input", JOptionPane.QUESTION_MESSAGE));
		int remainingAmount;

		//Find number of dollars
		int numberOfOneDollars = amount / 100;
		remainingAmount = amount % 100;

		//Find number of quarters in remaining amount
		int numberOfQuarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;

		//Find number of dimes in remaining amount
		int numberOfDimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;

		//Find number of nickles in remaining amount
		int numberOfNickles = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;

		//Find number of pennies in remaining amount
		int numberOfPennies = remainingAmount;

		//Format and display result
		String output = String.format("Your amount $%1.2f consists of\n", (double)amount / 100);
		if(numberOfOneDollars > 1)
			output += numberOfOneDollars + " dollars\n";
		else if(numberOfOneDollars == 1)
			output += numberOfOneDollars + " dollar\n";
		if(numberOfQuarters > 1)
			output += numberOfQuarters + " quarters\n";
		else if(numberOfQuarters == 1)
			output += numberOfQuarters + " quarter\n";
		if(numberOfDimes > 1)
			output += numberOfDimes + " dimes\n";
		else if(numberOfDimes == 1)
			output += numberOfDimes + " dime\n";
		if(numberOfNickles > 1)
			output += numberOfNickles + " nickles\n";
		else if(numberOfNickles == 1)
			output += numberOfNickles + " nickle\n";
		if(numberOfPennies > 1)
			output += numberOfPennies + " pennies\n";
		else if(numberOfPennies == 1)
			output += numberOfPennies + " penny\n";

		JOptionPane.showMessageDialog(null, output, "Exercise 3.1 Output", JOptionPane.INFORMATION_MESSAGE);
	}
}
