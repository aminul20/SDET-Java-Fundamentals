//5. Create a hashmap that will store 2, 5, 10, 20, 50, 100, 200, 500, 1000 tk note and each time generate 3 notes randomly and show their summation.
//        Output: 5 Tk, 50 Tk, 100 Tk. Total=155 Tk

package array_hashmap_date_function;

import java.util.HashMap;

public class program_5 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> banknote = new HashMap<Integer, Integer>();

        banknote.put(1,2);
        banknote.put(2,5);
        banknote.put(3,10);
        banknote.put(4,20);
        banknote.put(5,50);
        banknote.put(6,100);
        banknote.put(7,200);
        banknote.put(8,500);
        banknote.put(9,1000);
//        System.out.println(banknote);

        int Min = 1;
        int Max = 9;

        int number1 = (int) (Math.random() * (Max - Min)) + Min;
        int number2 = (int) (Math.random() * (Max - Min)) + Min;
        int number3 = (int) (Math.random() * (Max - Min)) + Min;
//        System.out.println("Sum is:");
        int sum = banknote.get(number1) + banknote.get(number2) + banknote.get(number3);

        System.out.println(banknote.get(number1)+" Tk, "+banknote.get(number2)+" Tk, "+banknote.get(number3)+" Tk. Total="+sum+" Tk");
    }
}
