/*Напишите функцию, которая берет последнее число 
из последовательного списка чисел и возвращает сумму
всех чисел до него и включая его.*/
import java.util.Scanner;

public class pr07 {
   public static void main(String[] args) {
       System.out.println("Enter a number n and let's calculate Sn ");
       System.out.println("Sn = 1 + 2 + ... + n");
       System.out.print("n = ");
       Scanner input = new Scanner (System.in);
       int a = input.nextInt();

       int Sn =Sn(a);
       System.out.println ("Sn = " + Sn);

       input.close();
   }
     public static int Sn(int n){
         int somme =0;
         for(int i=1;i<=n;i++){
         somme = somme +i;
 // return somme;
        }
        return somme;
     }  
   }

