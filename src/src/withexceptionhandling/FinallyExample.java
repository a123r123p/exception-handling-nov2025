package src.withexceptionhandling;

public class FinallyExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        int res = 0;
        try {
            System.out.println("inside try block before division operation");
            res = a / b;
            System.out.println("after try block after division operation");
        } catch (ArithmeticException e) {
            System.out.println("exception occurred : " + e.getMessage() + "----------" + e.getClass());
        } finally {
            System.out.println("a is :" + a);
            System.out.println("b is :" + b);
            System.out.println("res is :" + res);
            System.out.println("finally always executes");
        }
//        we can write a try block without catch block but finally must be present or catch must be present.try and catch,try and finally,or try catch and finally these combinations must be present.
    }
}
