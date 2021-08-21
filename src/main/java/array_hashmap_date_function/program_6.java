//6. Write a program that will show minimum number of currency notes to sum of given amount. For example: You input an amount 1400. The output will be:
//        1000 1
//        200 2
//        Or you input the amount 165. The output will be:
//        100 1
//        50 1
//        10 1
//        5 1

package array_hashmap_date_function;

import java.util.Scanner;

public class program_6 {
    public static void main(String[] args) {
        int i, amount = 900;
        Scanner scanner = new Scanner(System.in);

        int[] banknote = {1000, 500, 200, 100, 50, 20, 10, 5, 2};
        int[] noteCounter = new int[9];

        System.out.print("Input amount=");
        amount = scanner.nextInt();

        for (i = 0; i < 9; i++) {
            if (amount >= banknote[i]) {
                noteCounter[i] = amount / banknote[i];
                amount = amount - noteCounter[i] * banknote[i];
            }
        }

        // Print notes
//        System.out.println("Note Count");
        for (i = 0; i < 9; i++) {
            if (noteCounter[i] != 0) {
                System.out.println(banknote[i] + " : " + noteCounter[i]);
            }
        }
    }
}