package exercise_21_inhertance;

public class Lab_180_inhritance {
    public static void main(String[] args) {
father f1 = new father();
        System.out.println(f1.gold_f);
        f1.bhk2();

        son s1 = new son();
        System.out.println(s1.gold_f);
        s1.bhk2();
        s1.bhk3();
    }
}
class father{
    int gold_f = 1000;

    void  bhk2(){
        System.out.println("father - 2bhk");
    }
}
class son extends father{
    //    int gold_f = 1000; // Attribute | Data variables |  Property | Instance Variables
//
//    void bhk2() { //  Behaviour |  Method | Function | Data members
//        System.out.println("Father - 2BHK");
//    }

    void bhk3(){
        System.out.println("3bhk son");
    }

}
