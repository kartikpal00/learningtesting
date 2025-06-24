package exercise_13_while_loop;

import java.util.Scanner;

public class Task_19_grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your marks");
        int marks  = scanner.nextInt();



        if(marks>=90 && marks<=100){
            System.out.println("marks"+marks+ "grade A");
        } else if (marks>=80 && marks<+89) {
            System.out.println("marks" +marks+ "grade B");
            
        } else if (marks>=70 && marks<=79) {
            System.out.println("marks" +marks+"grade C");
            
        } else if (marks>=60 && marks<=69) {
            System.out.println("marks" +marks+"grade D");
            
        } else if (marks>=0 && marks<=59) {
            System.out.println("marks"+marks+ "grade E");
            
        }else {
            System.out.println("invalid");
        }
    }
}
