import java.util.Scanner;


public class pr08 {
    
	public static void main(String[] args)
	{
		System.out.println("Entering values of the edges of the triangle");
		Scanner input = new Scanner(System.in);
        System.out.print("First edge = ");
        int n = input.nextInt();
        System.out.print("Second edge = ");
		int m = input.nextInt();
		
        int t = Value3(n, m);
        System.out.print("maximum value of the third edge = ");
		System.out.print(t);
        input.close();
	}

public static int Value3(int n, int m)
	{
		return (n + m - 1);
	}
}
