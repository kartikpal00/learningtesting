package exercise_16_String;

public class Lab_141_String_Fuctions_02 {
    public static void main(String[] args) {

        String name  = "Sonal"; // 0,1,2,3,4
        System.out.println(name.length());
        System.out.println(name.charAt(3));
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(4));

       // System.out.println(name.charAt(10));  // java.lang,Stringindex out of Bounds Expection

        System.out.println(name.concat("patel"));

        //3.contains()
        System.out.println(name.contains("om"));

        //4. equals()
        System.out.println(name.equals("Sonal"));

        //5. equalsIgnoreCase()
        System.out.println(name.equalsIgnoreCase("sonal"));

        //6. indexOf() // sonal --> ? 0
        System.out.println(name.indexOf("o"));

        String s1 = "madam";
        // Returns the index within this string of the
        // first occurrence of the specified substring.

        System.out.println(s1.indexOf("m"));
        System.out.println(s1.lastIndexOf("m"));

        //7. length ()
        System.out.println(name.length());

        //8. replace ( , ) // sonal

        System.out.println(name.replace('n' , 'N'));

        //9. split()
        String name4 = "kartik@live.com@123";
        String[] split_name4  = name4.split("@");
        System.out.println(split_name4[0]);
        System.out.println(split_name4[1]);
        System.out.println(split_name4[2]);

        // 10. substring ()
        System.out.println(name.substring(0 , 4));

        //11 .  tolowecase()
        System.out.println(name.toLowerCase());

        // 12, touppercase ()
        System.out.println(name.toUpperCase());

        //14 . Startwith()
        System.out.println(name.startsWith("S"));

        //15. endswith()
        System.out.println(name.endsWith("a"));

        String anotherPalindrome = "Niagara. O roar again!";
        System.out.println(anotherPalindrome.length());

        String extract = anotherPalindrome.substring(11,15);
        System.out.println(extract);

        //        Concatenation (By +)

        String s111 = "Hello";
        String s222 = "World";

        String s333 = "ji";
        String result1 = s111 + s333 + s222;
        System.out.println(result1);

        String n = "PRamoddUTTA";
        System.out.println(n.indexOf("d"));
        System.out.println(n.lastIndexOf("d"));
        System.out.println(n.lastIndexOf("s"));


    }
}
