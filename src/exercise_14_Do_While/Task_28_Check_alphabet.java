package exercise_14_Do_While;

import java.util.Scanner;

public class Task_28_Check_alphabet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter alphabet");
        char ch  = scanner.next().charAt(0);

        if(ch>='a' && ch<='z'){
            System.out.println("'"+ch+ "'is an alphabet");
        }else {
            System.out.println(""+ch+ "'is not a alphabet'");
        }
    }
}
