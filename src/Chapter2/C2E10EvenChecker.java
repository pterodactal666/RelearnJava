package Chapter2;

import javax.swing.*;

/**
 * Created by Andrew on 17-Jun-14.
 * This program get input from user and determines whether it is even
 */
public class C2E10EvenChecker
{
	public static void main(String[] args)
	{
		//Get input
		int input = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter integer:", "Exercise 2.10 Input", JOptionPane.QUESTION_MESSAGE));

		//Format and output
		JOptionPane.showMessageDialog(null, "Is " + input + " an even number? " + (input % 2 == 0), "Exercise 2.10", JOptionPane.INFORMATION_MESSAGE);
	}
}
