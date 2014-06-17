package Chapter2;

import javax.swing.*;

/**
 * Created by Andrew on 17-Jun-14.
 * This program validates that a triangle is possible from 3 sides given by user
 */
public class C2E9ValidTriangle
{
	public static void main(String[] args)
	{
		//Get inputs from user
		String input = JOptionPane.showInputDialog(null, "Enter side 1:", "Exercise 2.9 Input 1", JOptionPane.QUESTION_MESSAGE);
		double firstSide = Double.parseDouble(input);
		input = JOptionPane.showInputDialog(null, "Enter side 2:", "Exercise 2.9 Input 2", JOptionPane.QUESTION_MESSAGE);
		double secondSide = Double.parseDouble(input);
		input = JOptionPane.showInputDialog(null, "Enter side 3:", "Exercise 2.9 Input 3", JOptionPane.QUESTION_MESSAGE);
		double thirdSide = Double.parseDouble(input);

		//Test cases, Hypo = Hypotenuse
		boolean sideThreeHypo = firstSide + secondSide > thirdSide;
		boolean sideTwoHypo = firstSide + thirdSide > secondSide;
		boolean sideOneHypo = secondSide + thirdSide > firstSide;
		boolean result = sideOneHypo ^ sideTwoHypo ^ sideThreeHypo;

		//Generate output
		String output = String.format("Can edges %1.2f, %1.2f, and %1.2f form a triangle? %b", firstSide, secondSide, thirdSide, result);
		JOptionPane.showMessageDialog(null, output, "Exercise 2.9 Ouput", JOptionPane.INFORMATION_MESSAGE);
	}
}
