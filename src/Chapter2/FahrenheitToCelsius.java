package Chapter2;

import javax.swing.*;

/**
 * Created by Andrew on 16-Jun-14.
 * This program reads a temperature in Fahrenheit from a input dialog box and displays the Celsuis convertion
 */
public class FahrenheitToCelsius
{
    public static void main(String[] args)
    {
	    //Get temperature for user
		String tempFahrString = JOptionPane.showInputDialog(null, "Enter temperature in Fahrenheit, e.g. 93.5", "Exercise 2.1 Input", JOptionPane.QUESTION_MESSAGE);

	    //Convert temperature string to double
	    double tempFahr = Double.parseDouble(tempFahrString);

	    //Convert temperature to Celsuis and format
	    double tempCels = ( 5.0 / 9.0 ) * ( tempFahr - 32 );
	    tempCels = (int)(tempCels * 100) / 100.0;

		//Generate output
	    String output = tempFahr + " degrees Fahrenheit is " + tempCels + " degrees Celsius";
	    JOptionPane.showMessageDialog(null, output, "Exercise 2.1 Output", JOptionPane.INFORMATION_MESSAGE);
    }
}
