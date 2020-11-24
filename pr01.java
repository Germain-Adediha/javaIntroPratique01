import java.util.Scanner;
//import java.math.*;

public class pr01 {

		public static void main(String[] args)
	{
		System.out.println("Enter two numbers");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();
		int t = remainder(n, m);
		System.out.println("the remainder(" + n + "/" + m + ")  = "  + t);
		input.close();
	}


	public static int remainder(int t1, int t2)
	{
        	return (t1 % t2);
	}
}