package exercise_14_Do_While;

import java.util.Scanner;

public class Lab122_cp_check_vowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a single alphabet:");
        char ch = scanner.next().toLowerCase().charAt(0);


        switch (ch){
            case 'a' ,'e' , 'i' , 'o' , 'u' -> System.out.println("vowel");
            default -> System.out.println("constant");
        }
    }
}
