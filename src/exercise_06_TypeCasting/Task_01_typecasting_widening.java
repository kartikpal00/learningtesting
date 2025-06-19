package exercise_06_TypeCasting;

public class Task_01_typecasting_widening {
    public static void main(String[] args) {
           int a = 100;
           double b = a; // widening -> implicit casting
           double b1 = (double)a;
        System.out.println(b);
        System.out.println(b1);
    }
}
