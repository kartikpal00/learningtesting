package exercise_17_StringBuffer_Builder_StringFunctions;

public class Lab_142_Stringbuffer_vs_stringbuilder {
    public static void main(String[] args) {
        String s0 = "kartik";
        String s1 =   new String("kartik");

        StringBuffer stringBuffer = new StringBuffer("kartik");
        StringBuilder stringBuilder  = new StringBuilder("kartik");

        System.out.println(s0);
        System.out.println(s1);
        System.out.println(stringBuffer);
        System.out.println(stringBuilder);
    }
}
