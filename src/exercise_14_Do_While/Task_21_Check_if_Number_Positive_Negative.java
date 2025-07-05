package exercise_14_Do_While;

import java.util.Scanner;

public class Task_21_Check_if_Number_Positive_Negative {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your number");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();

            if (0 <= number) {
                System.out.println("it is a positive number");
            } else {
                System.out.println("it is a negative number");
            }
        }
        else {
                System.out.println("character is not allowed please enter a valid number ");
            }
    }
}
