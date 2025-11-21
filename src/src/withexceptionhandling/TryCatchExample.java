package src.withexceptionhandling;

public class TryCatchExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int res = 0;
        try {
            System.out.println("inside try block before division operation");
            res = a / b;
            System.out.println("after try block before division operation");
        }catch(ArithmeticException e){
            System.out.println("exception occurred : "+e.getMessage()+"----------"+e.getClass());
        }
        System.out.println("a is :"+a);
        System.out.println("b is :"+b);
        System.out.println("res is :"+res);
    }
}
