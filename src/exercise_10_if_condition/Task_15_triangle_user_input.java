package exercise_10_if_condition;

import java.util.Scanner;

public class Task_15_triangle_user_input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the  side1 of Triangle");
        int side1 = scanner.nextInt();

        System.out.println("enetr the side2 of triangle");
        int side2 = scanner.nextInt();


        System.out.println("enter the side3 of triangle");
        int side3 = scanner.nextInt();

        if (side1==side2 && side2==side3){
            System.out.println("all side are equal");

        } else if (side1==side2 || side2==side3 || side1==side3) {
            System.out.println("two side are equal");

        }else {
            System.out.println("no side are equal");
        }
    }
}
