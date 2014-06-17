package Chapter2;

import javax.swing.*;

/**
 * Created by Andrew on 17-Jun-14.
 * This program calculates the future value of an investment from the initial value, interest rate and number of years, compounding monthly
 */
public class C2E12InterestCalc
{
	public static void main(String[] args)
	{
		//Get information from user
		String input = JOptionPane.showInputDialog(null, "Enter initial investment:", "Exercise 2.12 Input initial", JOptionPane.QUESTION_MESSAGE);
		double initialInvestment = Double.parseDouble(input);
		input = JOptionPane.showInputDialog(null, "Enter interest rate:", "Exercise 2.12 Input interest", JOptionPane.QUESTION_MESSAGE);
		double yearlyInterestRate = Double.parseDouble(input);
		input = JOptionPane.showInputDialog(null, "Enter number of years:", "Exercise 2.12 Input period", JOptionPane.QUESTION_MESSAGE);
		double numberOfYears = Double.parseDouble(input);

		//Calculations
		double monthlyInterestRate = yearlyInterestRate / 12;
		double futureInvestment = initialInvestment * Math.pow(1 + monthlyInterestRate / 100, numberOfYears * 12);

		//Format and output
		String output = String.format("The projected value of an account with an initial deposit of $%1.2f at %1.2f%% over %1.2f years is $%1.2f", initialInvestment, yearlyInterestRate, numberOfYears, futureInvestment);
		JOptionPane.showMessageDialog(null, output, "Exercise 2.12 Output", JOptionPane.INFORMATION_MESSAGE);
	}
}
