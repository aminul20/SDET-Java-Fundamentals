//5. Take a number as input from the user. Now write a program to show multiplication table of the given numbers.
// Output will be shown like this:
//        10*1=10
//        10*2=20
//        10*3=20
package ifelse_forloop;

import java.util.Scanner;

public class program_5 {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number for Multiplication Table");
        number = sc.nextInt();

        for (int i=1; i<=10; i++)
        {
            System.out.println(number+" X "+ i+" = "+ number*i);
        }
    }
}
