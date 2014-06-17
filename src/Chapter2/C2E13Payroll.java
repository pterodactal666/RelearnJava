package Chapter2;

import javax.swing.*;

/**
 * Created by Andrew on 17-Jun-14.
 * This program takes input from user and calculates the federal and state tax withholdings and net pay
 */
public class C2E13Payroll
{
	public static void main(String[] args)
	{
		//Get input
		String name = JOptionPane.showInputDialog(null, "Enter Employee's full name:", "Exercise 2.13 Input", JOptionPane.QUESTION_MESSAGE);
		double hours = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter number of hours worked in a week", "Exercise 2.13 Input", JOptionPane.QUESTION_MESSAGE));
		double payRate = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter hourly pay rate", "Exercise 2.13 Input", JOptionPane.QUESTION_MESSAGE));
		double federalTaxRate = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter federal tax withholding rate", "Exercise 2.13 Input", JOptionPane.QUESTION_MESSAGE));
		double stateTaxRate = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter state tax withholding rate", "Exercise 2.13 Input", JOptionPane.QUESTION_MESSAGE));

		//Calculations
		double grossPay = hours * payRate;
		double federalTaxAmount = grossPay * federalTaxRate;
		double stateTaxAmount = grossPay * stateTaxRate;
		double netPay = grossPay - federalTaxAmount - stateTaxAmount;

		//Format and output
		String output = String.format("Employee Name: %s\n\nHours Worked: %1.2f\nPay Rate: $%1.2f\nGross Pay: $%1.2f\n Federal Withholding (%1.1f%%): $%1.2f\n State Withholding (%1.1f%%): $%1.2f\n Total Deductions: $%1.2f\nNet pay: $%1.2f", name, hours, payRate, grossPay, federalTaxRate * 100, federalTaxAmount, stateTaxRate * 100, stateTaxAmount, federalTaxAmount + stateTaxAmount, netPay);
		JOptionPane.showMessageDialog(null, output, "Exercise 2.13 Output", JOptionPane.INFORMATION_MESSAGE);
	}
}
