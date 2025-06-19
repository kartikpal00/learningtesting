package exercise_07_Ternary_operator;

public class Lab065_TO_min {
    public static void main(String[] args) {
        // the minimum number between two number by usiong ternary operator ;

        int x = 10;
        int y = 20;
//        System.out.println(Math.min(x,y));

        int max = x<y ? x : y ;
        System.out.println(max);
    }
}
