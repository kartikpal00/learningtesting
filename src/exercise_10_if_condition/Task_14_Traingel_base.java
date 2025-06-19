package exercise_10_if_condition;

public class Task_14_Traingel_base {
    // triangle base
    public static void main(String[] args) {


        int a = 15, b = 20, c = 25;

        if (a == b & b == c) {
            System.out.println("two side equal");
        } else if (a == b & b == c & a == c) {
            System.out.println("three side are equal");
        } else {
            System.out.println("no side are equal");
        }
    }
}