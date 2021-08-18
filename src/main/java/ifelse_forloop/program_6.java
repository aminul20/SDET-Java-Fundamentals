//6. Write a program to print prime numbers from 2 to n [n is a number that will be taken from user input]
package ifelse_forloop;

import java.util.Scanner;

public class program_6 {
    public static void main(String[] args) {
        int i, j, mid, remainder, number;
        boolean flag=false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number for Prime Numbers Series");
        number = sc.nextInt();
        for (i=2; i<=number; i++)
        {
            flag = false;
            mid = i/2;
//            System.out.println("Trace: i="+i+" mid="+mid);
            for (j=2; j<=mid; j++)
            {
                remainder = i%j;
//                System.out.println("  Remainder: "+mid+"%"+j+"="+remainder);
                if (remainder == 0 )
                    flag = true;
            }
            if (!flag)
                System.out.println(i);
        }
    }
}
