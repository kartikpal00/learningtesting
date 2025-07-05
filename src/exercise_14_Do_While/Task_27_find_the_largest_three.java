package exercise_14_Do_While;

import java.util.Scanner;

public class Task_27_find_the_largest_three {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your number 1");
        int number1 = scanner.nextInt();

        System.out.println("enter your number 2");
        int number2 = scanner.nextInt();

        System.out.println("enter your number 3");
        int number3 = scanner.nextInt();

        if(number1>number2){
            System.out.println(+number1+ "\n number 1  is largest ");

        } else if (number2>number3) {
            System.out.println(+number2+ "\n number 2  is largest");

        }else if (number3>number1){
            System.out.println(+number3+ "\n number 3 is largest");
        }

        }
    }

