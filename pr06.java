
import java.util.Scanner;

//Создайте функцию, которая возвращает значение ASCII переданного символа.
public class pr06 {
	public static void main(String[] args)
	{
		System.out.print("Enter a symbol or character :   ");
		Scanner input = new Scanner(System.in);
        String s = input.nextLine();
    
		char[] ch = s.toCharArray();
       int a = Conv(ch[0]);
        
        System.out.println("ASCII value of " + s + " is " + a);
        
        input.close();
    }
    public static int Conv(char ch){
        int ascii = ch;
        return ascii;
    }
}