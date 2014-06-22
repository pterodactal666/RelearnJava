package Chapter3;

/**
 * Created by Andrew on 22-Jun-14.
 * This program uses a loop to display a Kilogram to Pound Table and a Pound to Kilogram table
 */
public class C3E10KiloToPound2Tables
{
	public static void main(String[] args)
	{
		//Set up headers
		String output = "Kilograms      Pounds      Pounds      Kilograms\n";
		int pounds = 20;
		for(int i = 1; i < 200; i += 2)
		{
			output += String.format("  %3d%15.1f%10d%15.2f\n", i, i * 2.2, pounds, pounds / 2.2);
			pounds += 5;
		}
		System.out.print(output);
	}
}
