package intermediate;

public class Loops {

    public static void build (){

       final StringBuilder build = new StringBuilder("aya");
        build.insert(3,"nompetsheni").append("nice");
        System.out.println(build);

    }
    public static void main(String[] args) {
        build();
///For-Loop
            for(int i = 0 ; i<5; i++ ){
                System.out.println("i is :" + i);
            }
//while loop
            int x =1;
            while (x <2){
                x = 5;
                System.out.println("x is :" +x);
                break;
            }
//do-while loop
        do {
        System.out.println("will print 1 time");
        }while (x ==1);{
            System.out.println("x is greater than zero");
        }
        }

}
