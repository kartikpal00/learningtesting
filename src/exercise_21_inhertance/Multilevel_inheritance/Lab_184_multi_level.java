package exercise_21_inhertance.Multilevel_inheritance;

public class Lab_184_multi_level {
    public static void main(String[] args) {

        // Son s1 = new Father();
        //  Son s1 = new GrandFather();

        Son amit = new Son();
        System.out.println(amit.gold_gf);
        amit.gf();

       Grandfather grandfather = new Son();
       Grandfather.home();


    }
}
