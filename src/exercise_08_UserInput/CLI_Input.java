package exercise_08_UserInput;

public class CLI_Input {
    public static void main(String[] args) {
//        int age = 65;
        String agea_string = args [0];
        System.out.println(agea_string);

        int age = Integer.parseInt(args[0]);
        String canvote = age>18 ? "yes" : "no";
        System.out.println("can vote: " + canvote);
    }
}
