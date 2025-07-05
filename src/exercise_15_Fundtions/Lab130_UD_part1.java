package exercise_15_Fundtions;

public class Lab130_UD_part1 {

        // User Defined Functions.

        // 1.Without Parameters and Without Return Type
        // 2.Without Parameters but With Return Type
        // 3.With Parameters and Without Return Type
        // 4. With Parameters and With Return Type
        public static void main(String[] args) {


            // 1.Without Argument / Parameters and Without Return Type.
            wp_wr_greet();

            //  2. Without Parameters but With Return Type
            String mes = greet_with_hello_wp_with_Rt();
            System.out.println(mes);

            //  3. With Parameters and Without Return Type ( 90%)
            greet_with_details("kartik", 20,100);
            greet_with_details("ankit", 25 , 75);

            //  4. With Parameters and With Return Type
            int sum =  sum_of_two_number(3,4);
            int sum2 = sum_of_two_number(190, 900);
            int sum3 = sum_of_two_number(2345, 5432);
            int sum4 = sum_of_three_number(2345, 5432, 5432);

            System.out.println(sum);
            System.out.println(sum2);
            System.out.println(sum3);
            System.out.println(sum4);

            int result = Math.max(3,4); // 4th Type
        }






    // 1. Without Parameters and Without Return Type. (Declare) /Define
    static void wp_wr_greet(){
        System.out.println("---> type 1 : Without Parameters and Without Return Type.");
        System.out.println("Hi , How are you");
    }

    //  2. Without Parameters but With Return Type
    static String greet_with_hello_wp_with_Rt(){
        System.out.println(" // type 2. Without Parameters but With Return Type");
        System.out.println("with return type");
        return "Hi , how are you";
        }

    //  3. With Parameters and Without Return Type ( 90%)
    static void greet_with_details(String name, int age , double salary){
        System.out.println("your name is ->"+ name + "\nyour age "+ age +"\nyour salary " + salary);
    }

    // with parameter and with return type,
    static int sum_of_two_number(int a , int b ){
        return a+b;
    }

    static int sum_of_three_number(int a , int b , int c ){
        return a+b+c;
    }
}
