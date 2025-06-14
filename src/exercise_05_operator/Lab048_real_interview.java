package exercise_05_operator;

public class Lab048_real_interview {
    public static void main(String[] args) {
        int balaji_salary = 12;
        boolean b = !(balaji_salary > 10 || balaji_salary < 5);
        System.out.println(b);

        // A -> balaji_salary > 10-> 12 > 10 -> true
        // b -> balaji_salary < 5 -> 12 < 5 -> false

        // !(A || B ) -> !(true || false) -> !true - false
    }
}
