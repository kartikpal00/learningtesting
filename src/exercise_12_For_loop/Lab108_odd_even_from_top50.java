package exercise_12_For_loop;

public class Lab108_odd_even_from_top50 {
    public static void main(String[] args) {

        // find the even number from 1 to 50

        for (int i = 1; i <= 50; i++) {
            // i%2 ==0
            if (i % 2 == 0) {
                System.out.println("even" + i);
            }
        }
    }
}