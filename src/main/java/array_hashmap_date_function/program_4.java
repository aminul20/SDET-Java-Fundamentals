//4. Write a program to find the position of a matched value from an array. If not matched, return -1 using function.
//        Given array is: {10,5,2,3,2,7,7,15,10} Output: 2, 7, 10
//        Input: User inputs 7
//        Output: Position: 5

package array_hashmap_date_function;

import java.util.Arrays;
import java.util.Scanner;

public class program_4 {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 2, 3, 2, 7, 7, 15, 10};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number to match=");
        int search_value = scanner.nextInt();

        System.out.println("Position: "+findMatching(numbers, search_value));

    }
    public static int findMatching(int[] numbers, int search_value) {
        int i, position=-1;

        for (i=0; i<numbers.length; i++)
        {
            if(numbers[i] == search_value)
            {
                position = i+1;
                break;
            }
        }

//         for (i=0; i<numbers.length; i++)
//        {
//            System.out.println(numbers[i]);
//        }
        return position;
    }
}
