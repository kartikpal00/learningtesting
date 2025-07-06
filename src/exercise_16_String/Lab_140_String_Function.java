package exercise_16_String;

public class Lab_140_String_Function {
    public static void main(String[] args) {
        String str1 = "Hellow";
        String str2 = " Hellow ";
        String str3 = new String("Hellow");

        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str1.equals(str3));
    }
}
