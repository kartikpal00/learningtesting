package exercise_07_Ternary_operator;

public class Task_07_nested_Ternary {
    public static void main(String[] args) {
        // user input ->
        // description marks =
        // a = 90 -> A+
        // b = 75 -> A
        //c = 60 -> B
        //d = 40 -> c
        // below 40 to fail

        int marks = 23;

               //        int a = 90;
               //        int b = 75;
               //        int c = 60;
               //        int d = 40;
               // marks > 40 = fail;

        String grade = (marks >= 90) ? "A+" : (marks >= 75) ? "A" : (marks >= 60) ? "B" : (marks >= 40) ? "C" : "fail";
        System.out.println(grade);
    }
}
