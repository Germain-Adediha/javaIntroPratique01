//import java.math.*;
import java.util.Scanner;

//import sun.jvm.hotspot.debugger.cdbg.IntType;

public class pr05 {
	public static void main(String[] args)
	{
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the values a , b and c");
        System.out.print("a = ");
        int  a = input.nextInt();
        System.out.print("b = ");
        int  b = input.nextInt();	
        System.out.print("c = ");
        int  c = input.nextInt();
	
        
        input.close();
        int k= operation(a, b, c);
        switch(k)
        {
            case(0): System.out.print("None"); break;
            case(1): System.out.print("Added"); break;
            case(2): System.out.print("Substracted"); break;
            case(3): System.out.print ("Divided");break;
            case(4): System.out.print("Multiplied");break;
        }

        /*
        if (k==0) System.out.print("None");
        if (k==1) System.out.print("Added");
        if (k==2) System.out.print("Substracted");
        if(k==)*/
    }
    public static int operation(int a,int b,int c)
    {
        if(c==a+b) return 1;
        if(c==a-b) return 2;
        if(c==a/b) return 3;
        if(c==a*b) return 4;
        else return 0;
    }

   /* {
        switch(c)
		{
			case (a+b):
				return 1; 
        			break;

			case (a-b):
                 return 2;
        			break;

			case (a*b):
			    return 3;
        			break;

			case (a/b):
                    return 4;
        			break;

		}
    }*/
    /*if(c==a+b) return 1;
    if(c==a-b) System.out.print("Substracted");
    if(c==a/b) System.out.print("Divided");
    if(c==a+b) System.out.print("Multiplied");
    else System.out.print("None");
}    */
    
}