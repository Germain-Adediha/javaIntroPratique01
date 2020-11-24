import java.util.Scanner;
//import java.math.*;

public class pr03 {
	public static void main(String[] args)
	{
		System.out.println("Entering the number of each animals");
		Scanner in = new Scanner(System.in);

		System.out.print("Number of chicken = ");
		int chicken = in.nextInt();
		System.out.println();
		System.out.print("Number of cow = ");
		int cow = in.nextInt();	
		System.out.println();
		System.out.print("Number of pig = ");
		int pig = in.nextInt();
		System.out.println();

		int legs = animals(chicken,cow,pig);
		System.out.println("Number of legs " + legs);

		in.close();
	}



	public static int animals(int a, int b, int c)
	{
        	return ((2*a) + (4 *b) + (4 * c));
	}
}