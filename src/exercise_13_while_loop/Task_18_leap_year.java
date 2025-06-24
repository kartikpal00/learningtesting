package exercise_13_while_loop;

import java.util.Scanner;

public class Task_18_leap_year {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter year");
        int ch  = scanner.nextInt();

        if (ch%4==0){
            System.out.println("this is a leap year");
        }else {
            System.out.println("this is not leap year ");
        }
    }
}
