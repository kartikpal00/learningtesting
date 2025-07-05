package exercise_14_Do_While;

import java.util.Scanner;

public class Task_26_find_the_smallest_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your number 1");
        int number1 = scanner.nextInt();


        System.out.println("enter your number 2");
        int number2 = scanner.nextInt();

        if (number1<number2){
            System.out.println(+number1+ "\n number is a smallest");

        }else if (number1 == number2){
            System.out.println("then number are equal");
        }else {
            System.out.println(+number2+ "\n number is smallest ");
        }
    }
}
