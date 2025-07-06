package exercise_14_Do_While;

import java.util.Scanner;

public class Task_30_ATM_withdrawl {
    public static void main(String[] args) {
        int acc_balaance = 10000;
        int rem_blance ;

        // initial account balaance of the user
        System.out.println("enter the withdrawl ammount in multiple of 100 ");
        Scanner scanner  = new Scanner(System.in);
        int withdrawl_balance  = scanner.nextInt();

        if (withdrawl_balance<=0){
            System.out.println("invalid balance");
            return;
        } else if (withdrawl_balance>acc_balaance) {
            System.out.println("insufficiant balance");
            System.out.println("please enter a valid amount");
            return;

        }
       /* else if (withdrawl_balance%100 !=0) {
            System.out.println("please enter a ammount in multiple of 100");
            return;
            
        }*/
        else {
            rem_blance = acc_balaance - withdrawl_balance;
            System.out.println("withdrawl succesfull");
            System.out.println("remaining balnce is "+rem_blance);
        }
    }
}
