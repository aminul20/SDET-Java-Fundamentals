//3. Write a program to take 3 inputs from user and do sum and average
package basic;

import java.util.Scanner;

public class program_3 {
    public static void main(String[] args) {
        int a, b, c, sum, avarage;
        Scanner sc = new Scanner(System.in);

        System.out.println("Input a number for a=");
        a = sc.nextInt();

        System.out.println("Input a number for b=");
        b = sc.nextInt();

        System.out.println("Input a number for c=");
        c = sc.nextInt();

        sum = a+b+c;
        avarage = sum/3;
        System.out.println("Sum Result: "+sum);
        System.out.println("Avarage Value: "+avarage);
    }
}
