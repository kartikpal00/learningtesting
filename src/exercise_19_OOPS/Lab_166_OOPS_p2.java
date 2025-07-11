package exercise_19_OOPS;

public class Lab_166_OOPS_p2 {
    public static void main(String[] args) {

        student s1 = new student();
        student s2;
        new student();

    }
}

class student {
    String name ;
    // is called as the default constructor, same name as the class name.

    student (){
        System.out.println("DC");
    }

    void  sleep (){
        System.out.println("HI");
    }
}
class A{}
class  B{}
