package Chapter3;

import javax.swing.*;

/**
 * Created by Andrew on 19-Jun-14.
 * This program sorts 3 integers from input
 */
public class C3E2SortInt
{
	public static void main(String[] args)
	{
		//Get input from user
		int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Integer 1:", "Exercise 3.2 Input", JOptionPane.QUESTION_MESSAGE));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Integer 2:", "Exercise 3.2 Input", JOptionPane.QUESTION_MESSAGE));
		int num3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Integer 3:", "Exercise 3.2 Input", JOptionPane.QUESTION_MESSAGE));
		int max, mid, min;

		//Sort into highest to lowest
		if(num1 >= num2 && num1 >= num3)
		{
			max = num1;
			if(num2 >= num3)
			{
				mid = num2;
				min = num3;
			}
			else
			{
				mid = num3;
				min = num2;
			}
		}
		else if(num2 >= num1 && num2 >= num3)
		{
			max = num2;
			if(num1 >= num3)
			{
				mid = num1;
				min = num3;
			}
			else
			{
				mid = num3;
				min = num1;
			}
		}
		else
		{
			max = num3;
			if(num1 >= num2)
			{
				mid = num1;
				min = num2;
			}
			else
			{
				mid = num2;
				min = num1;
			}
		}

		//Assign numbers properly
		num1 = min;
		num2 = mid;
		num3 = max;

		//Format and output
		JOptionPane.showMessageDialog(null, "The numbers in order are: " + num1 + ", " + num2 + " and " + num3, "Exercise 3.2 Output", JOptionPane.INFORMATION_MESSAGE);
	}
}
