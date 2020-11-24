import java.util.Scanner;
//import java.math.*;
//double a;
public class pr04 {
  //  double a,b,c;
    public static void main(String[] args)
	{
		System.out.println("Entering values ");
		Scanner in = new Scanner(System.in);

		System.out.print("Prob ");
		double prob = in.nextDouble();
		System.out.print("Prize ");
		double prize = in.nextDouble();	
		System.out.print("Pay ");
		double pay = in.nextDouble();

		double t = profitable(prob, prize, pay);
		
		if (t == 1) 	System.out.println("true");
		else 	        System.out.println("false");
		in.close();
		
	}

	public static double profitable(double a,double b,double c)
	{
        	if ((a*b) > c) return 1;
    		else return 0;
		
	}
}

