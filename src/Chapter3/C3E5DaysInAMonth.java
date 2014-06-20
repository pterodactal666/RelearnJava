package Chapter3;

import javax.swing.*;

/**
 * Created by Andrew on 20-Jun-14.
 * This program takes in the number of the month and year and outputs the number of days in that month
 */
public class C3E5DaysInAMonth
{
	public static void main(String[] args)
	{
		//Get input
		int month = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter month:", "Exercise 3.5 Input", JOptionPane.QUESTION_MESSAGE));
		int year = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter year:", "Exercise 3.5 Input", JOptionPane.QUESTION_MESSAGE));

		//Logic for days
		String output = "";
		switch(month)
		{
			case 1:
			{
				output = "January " + year + " has 31 days.";
				break;
			}
			case 2:
			{
				output = "February " + year + " has ";
				if((year % 4 == 0 && year % 100 != 0) || year % 400 ==0)
					output += "29 days.";
				else
					output += "28 days.";
				break;
			}
			case 3:
			{
				output = "March " + year + " has 31 days.";
				break;
			}
			case 4:
			{
				output = "April " + year + " has 30 days.";
				break;
			}
			case 5:
			{
				output = "May " + year + " has 31 days.";
				break;
			}
			case 6:
			{
				output = "June " + year + " has 30 days.";
				break;
			}
			case 7:
			{
				output = "July " + year + " has 31 days.";
				break;
			}
			case 8:
			{
				output = "August " + year + " has 31 days.";
				break;
			}
			case 9:
			{
				output = "September " + year + " has 30 days.";
				break;
			}
			case 10:
			{
				output = "October " + year + " has 31 days.";
				break;
			}
			case 11:
			{
				output = "November " + year + " has 30 days.";
				break;
			}
			case 12:
			{
				output = "December " + year + " has 31 days.";
				break;
			}
			default:
			{
				System.out.println("Invalid input.");
				System.exit(0);
			}
		}

		//Output
		JOptionPane.showMessageDialog(null, output, "Exercise 3.5 Output", JOptionPane.INFORMATION_MESSAGE);
	}
}
