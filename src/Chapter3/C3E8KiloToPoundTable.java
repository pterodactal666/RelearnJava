package Chapter3;

/**
 * Created by Andrew on 20-Jun-14.
 * This program displays a kilogram to pound table to 199kg
 */
public class C3E8KiloToPoundTable
{
	public static void main(String[] args)
	{
		//Set up headers
		String output = "Kilograms      Pounds\n";
		for(int i = 1; i < 200; i += 2)
		{
			output += String.format("  %3d%15.1f\n", i, i * 2.2);
		}
		System.out.print(output);
	}
}
