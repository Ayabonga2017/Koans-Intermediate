package intermediate;

public class Switch {
    public static void main(String[] args) {

        char character = 'a';
        switch (character){
            case 'b' : System.out.println("char is - b");
            break;
            case 'd' : System.out.println("char is - d");
            break;
            default: System.out.println("default");
            break;
            case 'a' : System.out.println("char is - a");
        }
    }
}
