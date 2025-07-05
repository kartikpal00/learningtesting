package exercise_14_Do_While;

import java.util.Scanner;

public class Task_24_check_vowel_constant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your name ");
        String ch = scanner.next();
        ch = ch.toLowerCase();

        int vowel = 0;
        int constant = 0;

        for (int i = 0; i < ch.length(); i++) {
            char cha  = ch.charAt(i);


            if (cha == 'a' || cha == 'e' || cha  == 'i' | cha  == 'o' || cha == 'u') {
                vowel++;
            } else {
                constant++;
            }

        }
        System.out.println("vowels"+ vowel);
        System.out.println("constant"+constant);

    }

}
