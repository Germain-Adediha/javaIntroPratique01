import java.util.Scanner;

//Создайте функцию, которая будет для данного a, b, c выполнять следующие действия:
// 1-Добавьте A к себе B раз.
//2-Проверьте, делится ли результат на C
public class pr10 {
    public static void main(String[] args)
	{
		System.out.println("Введите a b c");
		Scanner input = new Scanner(System.in);

		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		boolean t = abcmath(a, b, c);
		System.out.print(t);
input.close();
	}

public static boolean abcmath(int a, int b, int c)
	{

		int summ = a;

		for (int i = 0; i < b; i++)
		{

			summ = 2 * summ;
		}
System.out.println(summ); 
		if ((summ % c) == 0) return true;
		else return false;
		
	}
}
