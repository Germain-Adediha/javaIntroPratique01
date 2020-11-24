import java.util.Scanner;

/*Создайте функцию, которая принимает массив чисел и возвращает сумму его кубов*/

public class pr09 {



   public static void main(String[] args) {
        System.out.println("Enter the lenght  L of the array");
        System.out.print("L = ");
		Scanner input = new Scanner(System.in);
		int l = input.nextInt();
		int Sc = SumCubes(l);
		System.out.print(" Answer = " + Sc);
        input.close();
	}

public static int SumCubes(int n)
	{
		
		int sum = 0;
		int array[];
		array = new int[n] ;


		System.out.println("Enter the values of the array");
		Scanner input = new Scanner(System.in); 

		for (int i = 0; i < n; i++)
		{
    	array[i] = input.nextInt();
		}

		for (int i = 0; i < n; i++)
		{
			sum = sum + (array[i] * array[i] * array[i]);
		}
        input.close();
        return sum;
       
	}
     

    }

