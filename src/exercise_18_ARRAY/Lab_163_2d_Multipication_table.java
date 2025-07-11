package exercise_18_ARRAY;

import java.util.Scanner;

public class Lab_163_2d_Multipication_table {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size");
        int size_of_of_the_Table = scanner.nextInt();

        for (int i=0; i<size_of_of_the_Table; i++){
            for (int j=0; j<size_of_of_the_Table;j++){
                System.out.print(i*j+" | ");
            }

            System.out.println();
        }
    }
}
