package Chapter3;

import javax.swing.*;

/**
 * Created by Andrew on 19-Jun-14.
 *This program reads a selection and taxable amount from the user and calculates the appropriate tax
 */
public class C3E4ComputeTaxWithSelectionStatement
{
	public static void main(String[] args)
	{
		//Prompt user to enter filing status
		String statusString = JOptionPane.showInputDialog(null, "Enter the filing status:\n (0-single filer, 1-married jointly,\n 2-married separately, 3-head of household)","Exercise 3.4 Input", JOptionPane.QUESTION_MESSAGE);
		int status = Integer.parseInt(statusString);

		//Prompt user for taxable income
		String incomeString = JOptionPane.showInputDialog(null, "Enter taxable income:", "Exercise 3.4 Input", JOptionPane.QUESTION_MESSAGE);
		double income = Double.parseDouble(incomeString);

		//Compute tax
		double tax = 0;
		switch(status)
		{
			case 0:     //Compute tax for single filers
			{
				if(income <= 6000)
					tax = income * 0.10;
				else if(income <= 27950)
					tax = 6000 * 0.10 + (income - 6000) * 0.15;
				else if(income <= 67700)
					tax = 6000 * 0.10 + (27950 - 6000) * 0.15 + (income - 27950) * 0.27;
				else if(income <= 141250)
					tax = 6000 * 0.10 + (27950 - 6000) * 0.15 + (67700 - 27950) * 0.27 + (income - 67700) * 0.30;
				else if(income <= 307050)
					tax = 6000 * 0.10 + (27950 - 6000) * 0.15 + (67700 - 27950) * 0.27 + (141250 - 67700) * 0.30 + (income - 307050) * 0.35;
				else
					tax = 6000 * 0.10 + (27950 - 6000) * 0.15 + (67700 - 27950) * 0.27 + (141250 - 67700) * 0.30 + (307050 - 141250) * 0.35 + (income - 307050) * 0.386;
				break;
			}
			case 1:     //Compute tax for married jointly
			{
				if(income <= 12000)
					tax = income * 0.10;
				else if(income <= 46700)
					tax = 12000 * 0.10 + (income - 12000) * 0.15;
				else if(income <= 112850)
					tax = 12000 * 0.10 + (46700 - 12000) * 0.15 + (income - 46700) * 0.27;
				else if(income <= 171950)
					tax = 12000 * 0.10 + (46700 - 12000) * 0.15 + (112850 - 46700) * 0.27 + (income - 112850) * 0.30;
				else if(income <= 307050)
					tax = 12000 * 0.10 + (46700 - 12000) * 0.15 + (112850 - 46700) * 0.27 + (171950 - 112850) * 0.30 + (income - 171950) * 0.35;
				else
					tax = 12000 * 0.10 + (46700 - 12000) * 0.15 + (112850 - 46700) * 0.27 + (171950 - 112850) * 0.30 + (307050 - 171950) * 0.35 + (income - 307050) * 0.386;
				break;
			}
			case 2:     //Compute tax for married separately
			{
				if(income <= 6000)
					tax = income * 0.10;
				else if(income <= 23350)
					tax = 6000 * 0.10 + (income - 6000) * 0.15;
				else if(income <= 56425)
					tax = 6000 * 0.10 + (23350 - 6000) * 0.15 + (income - 23350) * 0.27;
				else if(income <= 85975)
					tax = 6000 * 0.10 + (23350 - 6000) * 0.15 + (56425 - 23350) * 0.27 + (income - 56425) * 0.30;
				else if(income <= 153525)
					tax = 6000 * 0.10 + (23350 - 6000) * 0.15 + (56425 - 23350) * 0.27 + (85975 - 56425) * 0.30 + (income - 85975) * 0.35;
				else
					tax = 6000 * 0.10 + (23350 - 6000) * 0.15 + (56425 - 23350) * 0.27 + (85975 - 56425) * 0.30 + (153525 - 85975) * 0.35 + (income - 153525) * 0.386;
				break;
			}
			case 3:     //Compute tax for married separately
			{
				if(income <= 10000)
					tax = income * 0.10;
				else if(income <= 37450)
					tax = 10000 * 0.10 + (income - 10000) * 0.15;
				else if(income <= 96700)
					tax = 10000 * 0.10 + (37450 - 10000) * 0.15+ (income - 37450) * 0.27;
				else if(income <= 156600)
					tax = 10000 * 0.10 + (37450 - 10000) * 0.15+ (96700 - 37450) * 0.27 + (income - 96700) * 0.30;
				else if(income <= 307050)
					tax = 10000 * 0.10 + (37450 - 10000) * 0.15+ (96700 - 37450) * 0.27 + (156600 - 96700) * 0.30 + (income - 156600) * 0.35;
				else
					tax = 10000 * 0.10 + (37450 - 10000) * 0.15+ (96700 - 37450) * 0.27 + (156600 - 96700) * 0.30 + (307050 - 156600) * 0.35 + (income - 307050) * 0.386;
				break;
			}
			default:
			{
				System.out.println("Error: invalid status");
				System.exit(0);
			}
		}

		//Format and output
		JOptionPane.showMessageDialog(null, String.format("Tax is $%1.2f", tax), "Exercise 3.4 Output", JOptionPane.INFORMATION_MESSAGE);
	}
}
