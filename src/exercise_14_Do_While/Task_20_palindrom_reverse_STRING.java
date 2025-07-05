package exercise_14_Do_While;

import java.util.Scanner;

public class Task_20_palindrom_reverse_STRING {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your name");
        String name = scanner.next().toLowerCase();
        String reverse = "";
        for(int i = name.length()-1; i>=0 ; i--){
            reverse += name.charAt(i);
        }
        if (name.equals(reverse)){
            System.out.println("it is a palindrome");
            System.out.println(name);
        }else {
            System.out.println("its not a palindrome");
        }

    }
}
