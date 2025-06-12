package exercise_02_java_basics;

public class Lab14_printf {
    public static void main(String[] args) {
        int a = 10;
        System.out.print("print command print without the new line");
        System.out.println("hello world");
        System.out.println("add the new line in the end ");


        System.out.println(a);
        System.out.printf(" your variable name is %d" , a);

        // %d -> 9int , byte , long , short , - data type
        // %s -> string
        // %f -> float , double
        // %b -> boolean
        int b = 20;
        System.out.println("---");
        System.out.printf("%d + %d", a,b );
    }

}

