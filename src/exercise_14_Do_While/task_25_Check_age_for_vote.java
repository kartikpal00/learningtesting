package exercise_14_Do_While;

import java.util.Scanner;

public class task_25_Check_age_for_vote {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your age");
        int age = scanner.nextInt();

        if (age>=18){
            System.out.println("you are eligible for vote ");
        }else{
            System.out.println("youj are not elibile for vote ");
        }
    }
}
