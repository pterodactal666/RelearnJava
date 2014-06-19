package Chapter3;

import javax.swing.*;

/**
 * Created by Andrew on 19-Jun-14.
 * This program determines if a triangle is valid and, if so, calculates its perimeter
 */
public class C3E3TrianglePerimeter
{
	public static void main(String[] args)
	{
		//Get input
		double firstSide = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter side 1:", "Exercise 3.3 Input", JOptionPane.QUESTION_MESSAGE));
		double secondSide = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter side 2:", "Exercise 3.3 Input", JOptionPane.QUESTION_MESSAGE));
		double thirdSide = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter side 3:", "Exercise 3.3 Input", JOptionPane.QUESTION_MESSAGE));
		double perimeter = 0;

		//Determine if valid and, if so, calculate perimeter
		if(firstSide + secondSide > thirdSide ^ secondSide + thirdSide > firstSide ^ firstSide + thirdSide > secondSide)
		{
			perimeter = firstSide + secondSide + thirdSide;
		}

		//Format and output
		if(perimeter == 0)
			JOptionPane.showMessageDialog(null, "Input was not valid", "Exercise 3.3 Output", JOptionPane.INFORMATION_MESSAGE);
		else
		{
			String output = String.format("The perimeter of a triangle with sides of %1.2f, %1.2f and %1.2f is %1.2f", firstSide, secondSide, thirdSide, perimeter);
			JOptionPane.showMessageDialog(null, output, "Exercise 3.3 Output", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
