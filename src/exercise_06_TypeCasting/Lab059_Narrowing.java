package exercise_06_TypeCasting;

public class Lab059_Narrowing {
    public static void main(String[] args) {
        int val = 300;
        //byte b = val; // Narrowing ( int -> byte ) - implicit casting is not allowed.
        byte b1 = (byte)val; //  Narrowing ( int -> byte ) - Explicit  casting is not allowed.

        // data loss
        System.out.println(b1);
    }
}
