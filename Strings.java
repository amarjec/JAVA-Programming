import java.util.*;

public class Strings {
    public static void stringFunctions (String str, String gtr, String s1) {

        System.out.println(s1.length());
        System.out.println(str.length());
        System.out.println(str.charAt(0));
        System.out.println(str.indexOf('g'));
        System.out.println(str.compareTo(gtr));
        System.out.println(str.contains("graw"));
        System.out.println(str.startsWith("Ama"));
        System.out.println(str.startsWith("Agr"));
        System.out.println(str.endsWith("wal"));
        System.out.println(str.endsWith("ar"));
        System.out.println(str.concat(gtr));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str +10);
        System.out.println(str +10+20);
        System.out.println(10+20+str);
        System.out.println(str + 'a');
        System.out.println(str + "a");
        System.out.println(str.substring(3));
        System.out.println(str.substring(0, 3));

    }
    public static void allSubstrings (String str) {
        for (int i=0; i<str.length(); i++) {
            for (int j=i+1; j<=str.length(); j++) {
                System.out.print(str.substring(i, j) + " ");
            }
        }
    }
    public static void interning (String s, String x) {
        x = "mello";
        System.out.println(s);
        System.out.println(x);
        String z = new String(s);
        System.out.println(z);
    }
    public static void equals() {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");

        // due to interning address of s1 and s2 are same
        if (s1 == s2) {
            System.out.println("S1 and s2 are same");
        }
        else {
            System.out.println("S1 and s2 are not same");
        }
        // due to  new   address of s1 and s3 different
        if (s1 == s3) {
            System.out.println("S1 and s3 are same");
        }
        else {
            System.out.println("S1 and s3 are not same");
        }




        // so we use equals() function for comparing of string
        if (s1.equals(s2)) {
            System.out.println("S1 and s2 are same");
        } else {
            System.out.println("S1 and s2 are not same");
        }
        if (s1.equals(s3)) {
            System.out.println("S1 and s3 are same");
        } else {
            System.out.println("S1 and s3 are not same");
        }
    }





    public static void main(String[] args) {
        String str = "Amar Agrawal";
        String gtr = "Jabalpur Engineering College";
        String s1 = "abcde";
        String s2 = "hello";
        String s3 = "hello";


//        System.out.println("All types of functions used in Strings :");
//        stringFunctions(str, gtr, s1);
//
//
//        System.out.println();
//        System.out.println("All substring of string :");
//        allSubstrings(s1);
//
//
//        System.out.println();
//        System.out.println();
//        interning(s2, s3);



        equals();

    }
}
