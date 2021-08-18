//3. Create a math quiz program. Scenario: 2 numbers will generate randomly and prompt user to input the summation of 2 numbers.
// If user inputs the correct summation, print "Answer is correct" and user will get 1 point.
// if user inputs wrong summation, then user will get 0 point. Finally after 5 iteration, total score will be shown.
package ifelse_forloop;

import java.util.Scanner;

public class program_3 {
    public static void main(String[] args) {
        int number1, number2, sum=0, answer, score=0;
        Scanner sc = new Scanner(System.in);

        int Min = 1;
        int Max = 100;

        for (int i=1; i<=5; i++)
        {
            number1 = (int) (Math.random() * (Max - Min)) + Min;
            number2 = (int) (Math.random() * (Max - Min)) + Min;
            sum = number1 + number2;
            System.out.println("Question "+i+":");
            System.out.println("What is the sum of "+number1+" and "+number2+" ?");
            answer = sc.nextInt();
            if (sum == answer)
            {
                System.out.println("Correct!");
                score++;
            }
            else
                System.out.println("Wrong!");
        }

        System.out.println("Quiz end!\nYour total score is "+score+" out of 5");
    }
}
