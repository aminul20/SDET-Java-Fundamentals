//4. Write a program to check balance and withdraw money from ATM booth using switch case and if else (1. Check balance 2. Withdraw Money)
package ifelse_forloop;

import java.util.Scanner;

public class program_4 {
    public static void main(String[] args) {
        int i, option_number, pin_number=1234, pin_input, login_attempt = 0, withdraw_amount;
        boolean withdraw_success=false;
        double balance = 5000;
//        double mynum = Math.random();
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Check balance");
        System.out.println("2. Withdraw Money");

        option_number = sc.nextInt();

        switch (option_number){
            case 1:
                for (i=1; i<=3; i++)
                {
                    System.out.println("Enter your PIN");
                    pin_input = sc.nextInt();
                    if (pin_number == pin_input)
                        break;
                    else {
                        System.out.println("Wrong PIN inserted!");
                        login_attempt++;
                    }
                }
                if (login_attempt == 3)
                    System.out.println("You have entered wrong PIN more than 3 times. Your card is blocked!");
                else
                    System.out.println("Current Balance is "+balance+" TK");
                break;
            case 2:
                for (i=1; i<=3; i++)
                {
                    System.out.println("Enter your PIN");
                    pin_input = sc.nextInt();
                    if (pin_number == pin_input)
                        break;
                    else {
                        System.out.println("Wrong PIN inserted!");
                        login_attempt++;
                    }
                }
                if (login_attempt == 3)
                    System.out.println("You have entered wrong PIN more than 3 times. Your card is blocked!");
                else{
                    System.out.println("Current Balance is "+balance+" TK");
                    for (i=1; i>0; i++)
                    {
                        System.out.println("Input amount that multiply by 500");
                        withdraw_amount = sc.nextInt();
                        if (withdraw_amount%500 != 0) {
                            System.out.println("Your input is not multiply by 500, Please try with different amount!\n");
                        }
                        else
                        {
                            if (withdraw_amount > balance) {
                                System.out.println("Not enough balance! \nPlease input correct amount.");
                                withdraw_amount = sc.nextInt();
                            }
                            else{
                                balance = balance - withdraw_amount;
                                System.out.println("Withdraw successful. Your current balance is "+balance+" TK.");
                                withdraw_success=true;
                                break;
                            }
                        }
//                        System.out.println("OK Balance is "+balance+" TK");
                    }
                }
                break;
        }
    }
}