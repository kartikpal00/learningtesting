package exercise_10_if_condition;

import java.util.Scanner;

public class Lab081_if_Else {
    public static void main(String[] args) {
        // Allowed to vote or not
        //if age > 18-> allowed to vote
        // else age < >18 -> Not aloowed to vote


        // this program is a CLI USE ////////

        /*int age = Integer.parseInt(args[0]);
        if(age>=18){
            System.out.println("you are allowed for vote ");
        }else {
            System.out.println("you are not allowed for vote");
        }
        String age_string = args[0];
        System.out.println(age_string);*/


        System.out.println("enter your age");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if(age>=18){
            System.out.println("you are allowed for vote ");
        }else {
            System.out.println("you are not allowed ");
        }
    }
}
