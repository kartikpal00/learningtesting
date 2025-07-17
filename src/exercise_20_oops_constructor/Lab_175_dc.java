package exercise_20_oops_constructor;

public class Lab_175_dc {
    public static void main(String[] args) {
        car c1 = new car();
        car c2 = new car();
        c1.name = "tesla";
        System.out.println(c1.name);
        System.out.println(c1.model);
        System.out.println(c1.year);

        System.out.println(c2.name);
        c2.name = "audi";
        System.out.println(c2.name);

        baby1 b1 = new baby1();
                // b1.name  = "Nivisha;
        System.out.println(b1.name);
    }

}
class car{
    String name ;
    int year;
    String model;

    //dc
    car(){
        name = "unknown car";
        year  = 1991;
        model = "xxx";

    }
}
class baby1{
    String name ;

    baby1(){
        name = "Gugu";
    }
        }