package exercise_10_if_condition;

public class Lab080_if {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);
        if(age>18){
            System.out.println("yes you can go to goa ");
        }
        else {
            System.out.println(" you can't go to goa ");
        }
        String agea_string = args [0];
        System.out.println(agea_string);
    }
}
