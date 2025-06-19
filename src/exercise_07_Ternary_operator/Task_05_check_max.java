package exercise_07_Ternary_operator;

public class Task_05_check_max {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        //System.out.println(Math.max(a,b));

//        for ternary operator
        int max = (a>b)? a:b;
        System.out.println(max);
    }
}
