package exercise_08_UserInput;

import java.util.Scanner;

public class Lab_userinput_scanner_02 {
    public static void main(String[] args) {

        System.out.println("enter the string ");
        Scanner scanner = new Scanner(System.in);
        String string_input = scanner.next();
        System.out.println(string_input);

        System.out.println("enetr the int ");
        int int_input = scanner.nextInt();
        System.out.println(int_input);

        System.out.println("enter the double ");
        double double_input = scanner.nextDouble();
        System.out.println(double_input);
    }
}
