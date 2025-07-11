package exercise_19_OOPS;

public class Lab_167_cats {
    Lab_167_cats(){
        System.out.println("dc - main class");


}
    public static void main(String[] args) {
        cat c1 = new cat();
        new cat();
        cat c2;

        c1.running();
//        c2.running();
        new cat().running();
    }

}
class cat{
    String name;
    void running (){
        System.out.println("Running");
    }
}
