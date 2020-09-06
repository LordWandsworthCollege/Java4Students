package x29Parameter;
public class Parameters {
    public static void main(String[] args) {
        para(47,"Ginger Headed Sailors");
        extension();
    }
    private static void para(int num, String sentence){
        System.out.println(num + sentence);
    }
    /*
    Task
    Write a Program with 2 variables, x and y . Write methods to
    add, multiply and subtract x and y
     */









    private static void extension(){
        int x = 7;
        int y = 9;
        add(x,y);
        subtract(x,y);
        multiply(x,y);
    }
    private static void add(int a, int b){
        System.out.println(a+b);
    }
    private static void multiply(int a, int b){
        System.out.println(a*b);
    }
    private static void subtract(int a, int b){
        System.out.println(a-b);
    }
}
