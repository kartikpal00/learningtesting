package exercise_14_Do_While;

import java.util.Scanner;

public class Task_23_find_maximum_two_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enetr your 1 number ");
        int number1 = scanner.nextInt();

        System.out.println("enter your 2 number");
        int number2 = scanner.nextInt();

        if(number1>number2){
            System.out.println( +number1+ "\n number is maximumn");
        } else if (number1 == number2) {
            System.out.println("then number are  equal ");

        } else {
            System.out.println(+number2+ " \n number is maximumn");
        }
    }
}
