package math.problems;

import java.util.Scanner;

public class Factorial {
    /*
     * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
     * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
     *
     */

    static int factorialRecursion(int n){
     if (n<=0)
         return 1;
     else return n*factorialRecursion(n-1);

 }
    static int factorialIteration(int n2) {
        int fact = 1;
        for (int i = 1; i <= n2; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
 int number,result;
        Scanner sc= new Scanner(System.in);
        System.out.println("Recursion method");
        System.out.println("Enter a positive number you want a factorial of: ");
        number=sc.nextInt();
        result=factorialRecursion(number);
        System.out.printf("%d!=%d",number,result);



       System.out.println("\nIteration method");
        int number2,result2;
        System.out.println("Enter a positive number you want a factorial of: ");
        number2=sc.nextInt();
        result2=factorialIteration(number2);
        System.out.printf("%d!=%d",number2,result2);

    }


}
