package exercise_18_ARRAY;

import java.util.Arrays;

public class Lab_151_arrays_max_min {
    public static void main(String[] args) {
        int[] arrays = {25,58,14,26,45,78,20,15,32,12}; // 0 to 9
       // Arrays.sort(arrays);
        // System.out.println(arrays[arrays.length-1]);

        int max_output  = give_me_max(arrays);
        int min_output = give_me_min(arrays);
        System.out.println(max_output);
        System.out.println(min_output);

    }

    static int give_me_max(int[]arrays){
        int max  = arrays[0];
        // logic

        for (int i = 0; i <arrays.length ; i++) {
            if(arrays[i]>max){
                max = arrays[i];
            }
            
        }
        return max;

    }

    static int give_me_min(int[]arrays){
        int min  = arrays[0];

        //logic
        for(int i  = 0 ; i< arrays.length; i++){
            if (arrays[i]<min){
                min = arrays[i];
            }
        }

        return min;
    }
}
