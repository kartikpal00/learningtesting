package exercise_12_For_loop;

import javax.naming.Name;
import java.util.Scanner;

public class Task_16_count_vowel {
    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in);
        System.out.println("enter the string of charactor");
        String name = scanner.nextLine();
        name =  name.toLowerCase();

        int vowels = 0;
        int constant = 0;

        for (int i = 0; i < name.length();i++){
            char ch = name.charAt(i);

            if (ch== 'a' || ch== 'e' || ch== 'i'| ch=='o' || ch=='u'){
         vowels++;      //System.out.println("vowels" + vowels);


            }else {

               constant++; //System.out.println("constant" + constant);

            }


        }
        System.out.println("vowels"+ vowels);
        System.out.println("constant"+constant);


    }
}
