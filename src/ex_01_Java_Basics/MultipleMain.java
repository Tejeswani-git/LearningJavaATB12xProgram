package ex_01_Java_Basics;

public class MultipleMain {
    public static void main(String[] args) {
        //jvm  recognizes and allow to RUN the methods
        System.out.println("This naming is acceptable in JAVA");
    }

    public static void main(int[] args) {
        //jvm doent recognize and doent and allow to RUN the methods
        System.out.println("This naming is acceptable in JAVA");

    }

    public static void main(String args) {
        //main method overloading
        System.out.println("This naming is acceptable in JAVA");
    }
}
