package exercise_11_Switch;

public class Lab092_JDKAbove {
    public static void main(String[] args) {
        // in JDK > 13
        // no need to break keyword
        // one line supporetd
        int itemcode = 001;
        switch (itemcode){

            case 001 -> System.out.println("001");
            case 002 -> System.out.println("002");
            case 003 -> System.out.println("003");
            default -> System.out.println("default");
        }
    }
}
