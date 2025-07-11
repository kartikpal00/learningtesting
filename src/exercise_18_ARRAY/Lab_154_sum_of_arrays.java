package exercise_18_ARRAY;

public class Lab_154_sum_of_arrays {
    public static void main(String[] args) {
        int[] number  = {12,34,100};
        int sum  = 0; // ---> 12+34+100 = 146

        for (int i = 0; i <number.length; i++) {
            sum = sum+number[i];
            
        }
        System.out.println(sum);
    }
}
