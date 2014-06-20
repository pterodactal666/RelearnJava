package Chapter3;

/**
 * Created by Andrew on 20-Jun-14.
 * This program displays a miles to kilometer table to 10 miles
 */
public class C3E9MilesToKilometerTable
{
	public static void main(String[] args)
	{
		//Set up headers
		String output = "Miles      Kilometers\n";
		for(int i = 1; i <= 10; i++)
		{
			output += String.format(" %2d%15.3f\n", i, i * 1.609);
		}
		System.out.print(output);
	}
}
