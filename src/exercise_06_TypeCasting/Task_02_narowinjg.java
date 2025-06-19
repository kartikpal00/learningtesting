package exercise_06_TypeCasting;

public class Task_02_narowinjg {
    public static void main(String[] args) {
        double d = 7846.9658;
//                int i = d ;
        int i = (int)d ;
//        System.out.println(i);
        System.out.println(d);  // NARROWING EXPILICIT
        System.out.println(i);
    }
}
