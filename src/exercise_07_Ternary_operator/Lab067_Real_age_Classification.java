package exercise_07_Ternary_operator;

public class Lab067_Real_age_Classification {
    public static void main(String[] args) {
        // age = 23
        // age < 18 -> minor
        // 18 < age > 65 -> adult
        // age > 65 -> senior citizen

        int age = 73;
        String result = (age<18) ? "minor" : (age<65) ? "adult": "senior citizen";
        System.out.println(result);
    }
}
