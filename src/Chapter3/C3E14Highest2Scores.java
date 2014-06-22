package Chapter3;

import javax.swing.*;

/**
 * Created by Andrew on 22-Jun-14.
 * This program takes the number of students, names and scores of students and displays the highest score
 */
public class C3E14Highest2Scores
{
	public static void main(String[] args)
	{
		//Get number of students
		int numberOfStudents = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number of students:", "Exersice 3.13 Input", JOptionPane.QUESTION_MESSAGE));
		String highestName = "", secondHighestName = "", inputName;
		double highestScore = 0, secondHighestScore = 0, inputScore;

		for(int i = 0; i < numberOfStudents; i++)
		{
			inputName = JOptionPane.showInputDialog(null, "Enter student name:", "Exercise 3.13 Input", JOptionPane.QUESTION_MESSAGE);
			inputScore = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter student score:", "Exercise 3.13 Input", JOptionPane.QUESTION_MESSAGE));

			if(i == 0)
			{
				highestName = inputName;
				highestScore = inputScore;
				secondHighestName = inputName;
				secondHighestScore = inputScore;
			}
			else if(inputScore > highestScore)
			{
				highestName = inputName;
				highestScore = inputScore;
			}
			else if(inputScore > secondHighestScore)
			{
				secondHighestName = inputName;
				secondHighestScore = inputScore;
			}
		}

		//Format and output
		String output = String.format("%s had the highest score with %1.2f\n%s had the second highest score with %1.2f", highestName, highestScore, secondHighestName, secondHighestScore);
		JOptionPane.showMessageDialog(null, output, "Exercise 3.13 Output", JOptionPane.INFORMATION_MESSAGE);
	}
}
