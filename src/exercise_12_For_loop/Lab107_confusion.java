package exercise_12_For_loop;

public class Lab107_confusion {
    public static void main(String[] args) {
        //for (int i=0; i<=10; i++){// 0 to 10  ,11 times run
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println("even" + i);
            }
        }
    }
}