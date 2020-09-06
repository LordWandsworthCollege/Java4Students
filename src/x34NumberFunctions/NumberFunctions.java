package x34NumberFunctions;
import java.util.Random;
public class NumberFunctions {
        static Random rand = new Random();
    public static void main(String[] args) {
        int int1 = rand.nextInt(100);
        double dbl1 = rand.nextDouble();
        System.out.println("Random Integers: "+int1);
        System.out.println("Random Double: "+(dbl1));
        extension();
    }
/*  Can you generate a random double between 1-20,
    rounded to 2dp
*/









    private static void extension(){
        System.out.printf("The Values is %.2f",(rand.nextDouble()*20));
    }
}
