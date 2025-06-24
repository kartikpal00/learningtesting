package exercise_12_For_loop;

import java.util.Scanner;

public class Task_17_palidrom_reverse {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("enter your name ");
        String name = scanner.nextLine().toLowerCase();

        String reversed = "";

        for (int i =name.length()-1; i>=0;i--){
            reversed +=name.charAt(i);

        }
        if(name.equals(reversed)){
            System.out.println("this is a palindrome");
        }else {
            System.out.println("this is not palindromme");
        }

    }
}
