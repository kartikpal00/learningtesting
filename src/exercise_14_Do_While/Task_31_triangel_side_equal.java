package exercise_14_Do_While;

import java.util.Scanner;

public class Task_31_triangel_side_equal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter side of traingle");

        System.out.println("enter side 1");
        int side_1 = scanner.nextInt();

        System.out.println("enter side 2");
        int side_2  = scanner.nextInt();

        System.out.println("enter side 3");
        int side_3 = scanner.nextInt();

        if( (side_1+side_2)>side_3 && (side_2+side_3)>side_1 && (side_3+side_1)>side_2) {
            System.out.println("Valid Triangle");
        } else
            System.out.println("Invalid Triangle");
    }
}
