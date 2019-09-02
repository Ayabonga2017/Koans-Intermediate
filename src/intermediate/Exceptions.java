package intermediate;

public class Exceptions {

    public static void doStuff() throws Exception {
        throw new Exception();
    }
    public static void main(String[] args) {
        try {
            System.out.println("This will print");
            doStuff();
            System.out.println("This will not print!");
        } catch(Exception ex) {
            System.out.println("there was an exception" +ex);
            ex.printStackTrace();
        } finally {
            System.out.println("\nDo this finally");
        }
        System.out.println("This will print");
    }
}
