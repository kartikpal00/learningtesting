package exercise_09_incre_decri_op;

public class LAB075_EXP1 {
    public static void main(String[] args) {

        int a= 10;
        System.out.println(a++ + ++a);
        System.out.println(a);

        // a++ -> A -> exp A -> 10 , a-> 11
        // ++a -> b -> exp B -> 12 , a -> 10
    }
}
