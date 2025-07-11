package exercise_18_ARRAY;

public class Lab_157_String_CLI_for_each {
    public static void main(String[] pramod) {
        // 10 pramod true

        for (int i = 0; i < pramod.length; i++) {
            System.out.println(pramod[i]);

        }

        System.out.println("------");

        for (String arg : pramod) {
        System.out.println(arg);
    }
    }
}
