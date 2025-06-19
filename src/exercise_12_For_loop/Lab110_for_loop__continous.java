package exercise_12_For_loop;

public class Lab110_for_loop__continous {
    public static void main(String[] args) {
        for (int i = 0; i<50; i++){

            if(i==5){
                continue;//skip the code and move to next lop
            }
            System.out.println(i);
        }
    }
}
