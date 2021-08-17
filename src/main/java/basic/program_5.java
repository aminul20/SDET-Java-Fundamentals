//5. Write a program to solve (a+b)^2 by taking input a and b from the user [^2 means whole square]

package basic;

import java.util.Scanner;

public class program_5 {
    public static void main(String[] args) {
        int a, b, sum;
        double result;
        Scanner sc = new Scanner(System.in);

        System.out.println("Input a Integer value for a=");
        a = sc.nextInt();

        System.out.println("Input a Integer value for b=");
        b = sc.nextInt();

        sum = a+b;
        result = Math.pow(sum,2);
        System.out.println("(a+b)^2 = " + (int) result);
    }
}
