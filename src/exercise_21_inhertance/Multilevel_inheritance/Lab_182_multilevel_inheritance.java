package exercise_21_inhertance.Multilevel_inheritance;

public class Lab_182_multilevel_inheritance {
    public static void main(String[] args) {
        Grandfather gf  = new Grandfather();
        gf.gf();
        System.out.println("----");


        father f1 = new father();
        f1.f();
        f1.gf();


        System.out.println("-----");


      Son s1 = new Son();
      s1.gf();
      s1.f();
      s1.s();

    }
}

