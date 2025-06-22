package JAVA_ATB12X_OOPS_Test;

public class Student {

    String name;
    int rollno;
    String section;

    public Student(String name, int rollno, String section) {
        this.name = name;
        this.rollno = rollno;
        this.section = section;
    }
    void print(){
        System.out.println("Details of the Students are Name :" +name +", rollno : " + rollno + ", section : " + section);
    }

    public static void main(String[] args) {
        Student s = new Student("Bob",101,"A");

        s.print();

    }
}
