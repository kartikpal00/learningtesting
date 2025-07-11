package exercise_18_ARRAY;

public class Lab_148_arrays {
    public static void main(String[] args) {
        int[] marks  = {1,2,3,4,5,6,};

        // 2nd way to create the arrays
        int[] marks2 = new int[5]; //fixed size , 5 ,to 4
        String[] name = new String[3]; // fixed size 3 , 0 to  2
        name[0] = "pramod";
        name[1] = "amit";
        name[2] = "kartik";
        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);
//        System.out.println(name[]);
    }
}
