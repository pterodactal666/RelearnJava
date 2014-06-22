package Chapter3;

import javax.swing.*;

/**
 * Created by Andrew on 22-Jun-14.
 * This program takes the number of students, names and scores of students and displays the highest score
 */
public class C3E13HighestScore
{
	public static void main(String[] args)
	{
		//Get number of students
		int numberOfStudents = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number of students:", "Exersice 3.13 Input", JOptionPane.QUESTION_MESSAGE));
		String highestName = "", inputName;
		double highestScore = 0, inputScore;

		for(int i = 0; i < numberOfStudents; i++)
		{
			inputName = JOptionPane.showInputDialog(null, "Enter student name:", "Exercise 3.13 Input", JOptionPane.QUESTION_MESSAGE);
			inputScore = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter student score:", "Exercise 3.13 Input", JOptionPane.QUESTION_MESSAGE));

			if(inputScore > highestScore)
			{
				highestName = inputName;
				highestScore = inputScore;
			}
		}

		//Output
		JOptionPane.showMessageDialog(null, highestName + " had the highest score of " + highestScore, "Exercise 3.13 Output", JOptionPane.INFORMATION_MESSAGE);
	}
}
