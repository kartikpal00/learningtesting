package exercise_06_TypeCasting;

public class Lab058_TypeCasting {
    public static void main(String[] args) {
        byte b = 10;
        int a = b ; // widening -> implicit Casting
        int a1 = (int)b ; // Widening -> Explicit Casting
        // int a1 = (int)b; for example
    }
}
