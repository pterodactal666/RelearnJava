package Chapter3;

/**
 * Created by Andrew on 22-Jun-14.
 * This program displays a miles to kilometer table and a kilometer to miles table
 */
public class C3E11MilesToKilometer2Tables
{
	public static void main(String[] args)
	{
		//Set up headers
		String output = "Miles      Kilometers      Kilometers      Miles\n";
		int kilometers = 20;
		for(int i = 1; i <= 10; i++)
		{
			output += String.format(" %2d%15.3f%14d%16.3f\n", i, i * 1.609, kilometers, kilometers / 1.609);
			kilometers += 5;
		}
		System.out.print(output);
	}
}
