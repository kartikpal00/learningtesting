package exercise_17_StringBuffer_Builder_StringFunctions;

public class Lab_143_stringbuffer {
    public static void main(String[] args) {
        StringBuffer stringBuffer  = new StringBuffer("kartik");
        stringBuffer.append("pal");
        System.out.println(stringBuffer);

        System.out.println(stringBuffer.reverse());

        String s1 = "Hello";
        String s2 = "world";
        String  s3 = s1 + s2 ;
        System.out.println(s3);
        System.out.println( s1);
    }
}
