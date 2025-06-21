package Java_ATB_12x_Test;

public class Question3 {
    public static void main(String[] args) {

        int a = 10;
        int b =5;
        //Arithmetic Operators
        System.out.println( "Comparision Operators:");

        //==
        System.out.println( "== Operators: a == b = " +(a==b));

        //!=
        System.out.println( "!= Operators: a != b = " +(a!=b));

        //<
        System.out.println( "< Operators: a < b = " +(a<b));

        //>
        System.out.println( "> Operators:a > b = " +(a>b));

        //<=
        System.out.println( "<=,  Operators:a <= b = " +(a<=b));

        //>=
        System.out.println( ">=,  Operators:a >= b = " +(a>=b));

        //logical operators (&&, ||, !)
        boolean x = true;
        boolean y = false;

        //&&
        System.out.println( "&& Operators: x && y = " + (x && y));

        //||
        System.out.println( "|| Operators: x || y = " + (x || y));

        //!
        System.out.println( "! Operators: !(x > y) = " +!(x));
    }
}
