package JAVA_ATB12X_STRING_TEST;

public class StringComparision {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";
        String str3 = "Hello";

        // 1. Using == operator (checks reference)
        System.out.println("== Operator:");
        System.out.println("str1 == str2 : " + (str1 == str2));
        System.out.println("str1 == str3 : " + (str1 == str3));

        // 2. Using equals() method (checks content)
        System.out.println("\n.equals() Method:");
        System.out.println("str1.equals(str2) : " + str1.equals(str2));
        System.out.println("str1.equals(str3) : " + str1.equals(str3));

        // 3. Using equalsIgnoreCase() method
        System.out.println("\n.equalsIgnoreCase() Method:");
        System.out.println("str1.equalsIgnoreCase(str3) : " + str1.equalsIgnoreCase(str3));

        // 4. Using compareTo() method (returns int: 0 if equal, <0 if less, >0 if greater)
        System.out.println("\n.compareTo() Method:");
        System.out.println("str1.compareTo(str2) : " + str1.compareTo(str2));
        System.out.println("str1.compareTo(str3) : " + str1.compareTo(str3));
        System.out.println("str4.compareTo(str1) : " + str3.compareTo(str1));
    }
}
