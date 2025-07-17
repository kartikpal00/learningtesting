package exercise_21_inhertance.hierarchical;

public class Lab_185_HIERARCHICAL {

    public static void main(String[] args) {

        father f1 = new father();
        ruhani r1 = new ruhani();

                r1.home();
        f1.home();

        pramod p1 = new pramod();
        p1.home();

        lucky l1 = new lucky();
        l1.l2();
        l1.home();

    }
}

class father {
    void home (){
        System.out.println("3BHK");
    }
}

class pramod extends father{
    void h2(){
        System.out.println("h2_ pramod");
    }
}

class  lucky extends father{
    void l2(){
        System.out.println("licky");
    }
}
class ruhani extends father{
    void r1(){
        System.out.println("ruhanji");
    }
}

