package exercise_18_ARRAY;

import java.util.Scanner;

public class Lab_152_arrays_user_input {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size of array(int) only");
        int size  = scanner.nextInt();

        int[] number_marks = new int [size];

//        float[] number_marks  = new  float[size];
//        String[] number_marks  = new String[size];

        for (int i = 0; i <number_marks.length ; i++) {
            System.out.println("enter the number");
            number_marks[i] = scanner.nextInt();
            
        }

        System.out.println("-----Below code is printing the elements !");

        for (int i = 0; i < number_marks.length; i++) {
            System.out.println(number_marks[i]);
            
        }
    }
}
