package JAVA_ATB12X_OOPS_Test;

public class Person {
    String name;
    int age;
    public Person(String name,int age) {
        this.name =name;
        this.age = age;
    }
    void print(){
        System.out.println("Name :" +name + ", Age :" +age);
    }

    public static void main(String[] args) {
    Person p1= new Person("Alice" ,30);
    Person p2= new Person("John" ,25);

p1.print();
p2.print();

}

}
