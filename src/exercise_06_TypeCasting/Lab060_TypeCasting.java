package exercise_06_TypeCasting;

public class Lab060_TypeCasting {
    public static void main(String[] args) {
        long phone = 6397963154l;
        //  short s = phone; // implicit Narrow? not allowed
        short s1 = (short) phone ; // Explicit narrow? yes allowed
        System.out.println(s1);
    }
}
