package Chapter2;

import javax.swing.*;

/**
 * Created by Andrew on 16-Jun-14.
 * This program reads a radius and length for input and calculates the volume of a cylinder
 */
public class CylinderVolume
{
	public static void main(String[] args)
	{
		//Get radius from user
		String input = JOptionPane.showInputDialog(null, "Enter cylinder radius:", "Exercise 2.2 Input Radius", JOptionPane.QUESTION_MESSAGE);

		//Convert input string to radius double
		double radius = Double.parseDouble(input);

		//Get length from user
		input = JOptionPane.showInputDialog(null, "Enter cylinder length:", "Exercise 2.2 Input Length", JOptionPane.QUESTION_MESSAGE);

		//Convert input string to length double
		double length = Double.parseDouble(input);

		//Calculate the circle area, volume and format to 2 decimal places
		double area = radius * radius * Math.PI;
		double volume = area * length;
		volume = (int)(volume * 100) / 100.0;

		//Generate result string and output
		String output = "The volume of a cylinder with radius " + radius + " and length " + length + " is " + volume;
		JOptionPane.showMessageDialog(null, output, "Exercise 2.2 Output", JOptionPane.INFORMATION_MESSAGE);
	}
}
