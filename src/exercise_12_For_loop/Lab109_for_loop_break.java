package exercise_12_For_loop;

public class Lab109_for_loop_break {
    public static void main(String[] args) {
        for(int i=0; i<50; i++){
            if (i==5){
                break;
            }else{
                System.out.println(i);
            }
        }
    }
}
