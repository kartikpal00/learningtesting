package exercise_20_oops_constructor;

public class Lab_177_PC_real {
    public static void main(String[] args) {
        person p1 = new person("amit",93651453,"abc");
        System.out.println(p1.name);
        person p2 = new person("pramod",64734412,"xyz");
        System.out.println(p2.name);
        System.out.println(p2.phone);

        person p3 = new person();
        p3.name = "smita";
        System.out.println(p3.name);
    }

}
class  person {
    String name;
    long phone;
    String address;

    person() {

    }

    person(String name_user) {
        this.name = name_user;
    }
    person(String name_user,long phone_user , String address_user){
        this.name = name_user;
        this.phone = phone_user;
    }
}