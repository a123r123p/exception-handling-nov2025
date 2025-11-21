package src.withexceptionhandling;

public class ThrowExample {
    public static void main(String[] args) {
        int a = 20;
        try {
            if (a != 20) {
                System.out.println("a is :" + a);
            } else {
                throw new RuntimeException("a is 20 so manually i am throwing exception");
            }
        }catch(Exception e){
            System.out.println("Exception occurred : "+e.getMessage()+"---------------"+e.getClass());
        }
        // search user in database
        // if user is not null
        // else throw UserNotFoundException
        // and handle it.
    }
}
