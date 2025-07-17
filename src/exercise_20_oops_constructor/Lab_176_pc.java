package exercise_20_oops_constructor;

public class Lab_176_pc {
    public static void main(String[] args) {
        BabyA b1 = new BabyA();
        BabyA b2 = new BabyA();
        System.out.println(b1.name);
        System.out.println(b2.name);
        System.out.println(b1.aadhar_number);
        System.out.println(b2.aadhar_number);

        BabyA b3 = new BabyA("lucky","25464154",2025,07,01);
        BabyA b4 = new BabyA("amit","5746543311",2024,07,01);
        System.out.println(b3.name);
        System.out.println(b4.name);
        System.out.println(b3.aadhar_number);
        System.out.println(b4.aadhar_number);
    }

}
class BabyA{

    String name;
    String aadhar_number;
    int year;
    int month;
    int day;
    //DC

    BabyA(){
        name = "GUgu";
        aadhar_number = "0000";
        year = 1971;
        month = 01;
        day = 01;
    }
    BabyA(String name_user,String aadhar_number_user,int year_user,int month_user,int day_user){
        this.name = name_user;
        this.aadhar_number = aadhar_number_user;
        this.year = year_user;
        this.month = month_user;
        this.day = day_user;
    }

}

