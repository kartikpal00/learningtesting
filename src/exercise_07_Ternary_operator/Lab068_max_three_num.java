package exercise_07_Ternary_operator;

public class Lab068_max_three_num {
    public static void main(String[] args) {
        // find the maximum number between the three numbner .
        // now we will be using the logic building formula
         int n1 = 2;
         int n2 = 9;
         int n3 = -11;

         // step 1 : find inputs / outputs
        // I/O -> n1,n2,n3 - int
        // O/P -> String -> max number

        //step 2 : rough logic , thjink about it .
        // n1>n2 and n1>n3 -> n1
        // n2 > n1 and n2 > n3 -> n2
        // n3

        // step 3
        int max  = (n1>n2)?  (n1>n3) ?  n1 : n3 : (n2>n3)? n2 : n3;
        // a -> (n1 > n3 ) ? n1 : n3
        // b -> (n2>n3) ? n2 : n3
        System.out.println(max);
    }
}
