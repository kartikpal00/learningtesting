package exercise_13_while_loop;

import java.util.Random;
import java.util.Scanner;

public class Lab120_while_game_GUESSING {
    public static void main(String[] args) {
        // Guess a number between 1 and 100
        // Random =>  1 to 100
        Random random = new Random();
        int numbertoguess = random.nextInt(100)+1;
        //        System.out.println(numberToGuess);

        Scanner scanner =new Scanner(System.in);
        System.out.println("enter a number");

        int guess;
        int attempts = 0;

        while(true){
            guess = scanner.nextInt();
            attempts++;

            if(guess < numbertoguess){
                System.out.println("Too Low And Try Again");
            } else if (guess > numbertoguess){
                System.out.println("ToO High And Try Again");
            }else {
                System.out.println("correct ! YOU GREAT IT IN " + attempts + " attempts ");
            }
        }

    }
}
