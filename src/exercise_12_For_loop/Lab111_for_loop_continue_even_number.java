package exercise_12_For_loop;

public class Lab111_for_loop_continue_even_number {
    public static void main(String[] args) {
        for (int i = 0 ; i<=50; i++){
            if (i%2==0){
                continue;
            }
            System.out.println("odd-> " + i);
        }
    }
}
