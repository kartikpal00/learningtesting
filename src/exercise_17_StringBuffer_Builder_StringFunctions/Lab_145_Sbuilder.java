package exercise_17_StringBuffer_Builder_StringFunctions;

public class Lab_145_Sbuilder {
    public static void main(String[] args) {
        StringBuilder sb  = new StringBuilder("hello");
        sb.append("world");
        sb.reverse();
        System.out.println(sb);
    }
}
