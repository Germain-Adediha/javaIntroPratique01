import java.util.Scanner;

//import jdk.internal.util.xml.impl.Input;

//import java.math.*;

public class pr02 {
	public static void main(String[] args)
	{
		System.out.println("Enter the base");
		Scanner in = new Scanner(System.in);
        int b = in.nextInt();
        System.out.println("Enter height ") ;
		int h = in.nextInt();
		int area = triArea(b, h);
		System.out.println("Area of ​​a triangle = " + area);
		in.close();
	}


	public static int triArea(int a, int b)
	{
        	return (a * b / 2);
	}
}