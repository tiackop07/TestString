public class ClassExampleTest {

    private static ClassExample classExample;

    public static final String[] validAccount = new  String[]{"A1234B", "C2311H", "P1234E"};
    public static final String[] inValidAccount = new String[]{".@", "12345", "1234_", "abcde"};

    public static void main(String[] args) {
        classExample = new ClassExample();
        for (String account : validAccount){
            boolean isValid = classExample.validate(account);
            System.out.println("Account is " + account + " is valid: " + isValid);
        }
        for (String account : inValidAccount) {
            boolean isValid = classExample.validate(account);
            System.out.println("Account is " + account + " is valid: " + isValid);
        }
    }
}
