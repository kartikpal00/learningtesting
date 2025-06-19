package exercise_10_if_condition;

import java.util.Scanner;

public class Lab079_IF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your age ");
        int age = scanner.nextInt();

        if(age>18){
            System.out.println("allowed to vote ");
        }
    }
}
