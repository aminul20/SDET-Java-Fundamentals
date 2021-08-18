//1. Write a program that takes a year from user and print whether that year is a leap year or not-------------------------------2
package ifelse_forloop;

import java.util.Scanner;

public class program_1 {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);

        System.out.println("Input any Year=");
        year = sc.nextInt();

        //Tracing the problem
//        int a,b,c;
//        a = year%4;
//        System.out.println("a="+a);
//        b = year%100;
//        System.out.println("b="+b);
//        c = year%400;
//        System.out.println("c="+c);

        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " is a Leap Year.");
        } else if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0)
            System.out.println(year + " is a Leap Year.");
        else
            System.out.println(year + " is not a Leap Year.");
    }
}