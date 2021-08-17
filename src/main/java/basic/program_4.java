//4. Write a program to generate random numbers from minimum range to maximum range by user input

package basic;

import java.util.Scanner;

public class program_4 {
    public static void main(String[] args) {
        int min, max;
        double randomNumber;
        Scanner sc = new Scanner(System.in);

        System.out.println("Input a number for Minimum Range=");
        min = sc.nextInt();
        System.out.println("Input a number for Maximum Range=");
        max = sc.nextInt();

        randomNumber = (Math.random() * (max - min)) + min;
        System.out.println("Your Random Number is: "+ (int) randomNumber);

    }
}
