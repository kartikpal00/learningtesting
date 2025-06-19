package exercise_11_Switch;

public class Lab093_JDK_multimatch {
    public static void main(String[] args) {
        int itemcode = 006;
        switch (itemcode){
            case 001,002,005:
                System.out.println("all of them are electronic gadget");
                break;
            case 004,006,007:
                System.out.println("this is mech");
                break;
            default:
                System.out.println("none");
        }
    }
}
