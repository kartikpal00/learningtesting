package exercise_14_Do_While;

import java.util.Scanner;

public class Task_29_Check_prime_number {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int num = scanner.nextInt();
        int count  = 0;
        if (num>1){
            for (int i = 1 ; i<=num  ; i++){
                if(num%i ==0){
                    count++;
                }
            }
        }
        if(count==2){
            System.out.println(num + " prime");
        }else{
            System.out.println(num + "not prime");
        }
        }
    }