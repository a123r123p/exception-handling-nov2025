package src.userdefinecustomexception;

public class SampleClass {
    public static void main(String[] args) {
        try {
            String user = null;
            if (user == null) {
                throw new UserNotFoundException("User not found");
            }
        } catch (Exception e) {
            System.out.println("exception occurred : " + e.getMessage() + "----------" + e.getClass());
        }
    }
}
