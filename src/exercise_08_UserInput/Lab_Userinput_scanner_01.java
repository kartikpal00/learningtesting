package exercise_08_UserInput;

import java.util.Scanner;

public class Lab_Userinput_scanner_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age ");

        int age = scanner.nextInt();
        String canivote = age>=18 ? "yes" : "no";
        System.out.println(canivote);


    }
}
