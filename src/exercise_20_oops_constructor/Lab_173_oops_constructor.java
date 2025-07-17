package exercise_20_oops_constructor;

public class Lab_173_oops_constructor {
    public static void main(String[] args) {
        Baby b1 = new Baby();
    }

}
class Baby {
    // Attribute | Instance Variable |  Member variables, data members
    String name ;
    // Default Constructor!
    Baby(){
        System.out.println("i am called , Default constructor ");
        System.out.println("your adhar number is ready");

        // Fetch data from the MySQL database...
        // Read from CSV File , XLSX
        // Open a file and read the data. (json, testdata.xlsx, txt file)


    }
    void m1(){
        System.out.println("I m1");
    }
    void cry(){
        System.out.println("cry");
    }
    void sleep(){
        System.out.println("sleep");
    }
    void eat(){
        System.out.println("eat");
    }
}