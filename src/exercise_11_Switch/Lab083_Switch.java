package exercise_11_Switch;

import java.util.Scanner;

public class Lab083_Switch {
    public static void main(String[] args) {
        //
         // Take a user  input and tell them the day which they have told
        // 1 to 7 -> mon , 5 --> fri
        // 8 ? - not allowed or error

//        int day = Integer.parseInt(args[0]);
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the day 1 to 7");
        int day = scanner.nextInt();

        switch (day){
            case 1 :
                System.out.println("monday");
                break;
            case 2 :
                System.out.println("tuesday");
                break;
            case 3 :
                System.out.println("wednesday");
                break;
            case 4 :
                System.out.println("thursday");
                break;
            case 5 :
                System.out.println("friday");
                break;
            case 6 :
                System.out.println("saturday");
                break;
            case 7 :
                System.out.println("sunday");
                break;
            default:
                System.out.println("Not allowed");
                break;
        }
    }
}
