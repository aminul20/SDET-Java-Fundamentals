//2. Find the second largest number from an array by user input using function

package array_hashmap_date_function;

import java.util.Arrays;
import java.util.Scanner;

public class program_2 {
    public static void main(String[] args) {
        int numbers[] = new int[5];
        int i;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input 5 Integer number");
        for (i=0; i<5; i++)
        {
            System.out.println("Value "+(i+1)+"=");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Second largest number is: "+findMaximum(numbers));
    }

    public static int findMaximum(int[] numb) {
        Arrays.sort(numb);
        int second_largest = numb[numb.length-2];

//         for (int i=0; i<5; i++)
//        {
//            System.out.println(numb[i]);
//        }
         return second_largest;
    }
}
