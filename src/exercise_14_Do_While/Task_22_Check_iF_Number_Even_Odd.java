package exercise_14_Do_While;

import java.util.Scanner;

public class Task_22_Check_iF_Number_Even_Odd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your number");
        if(scanner.hasNextInt()) {
            int number = scanner.nextInt();

            if (number % 2 == 0) {
                System.out.println("it is a even number");
            } else {
                System.out.println("it is a odd number");
            }
        } else{
                System.out.println("please enter a valid number");
            }

    }
}
