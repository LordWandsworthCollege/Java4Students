package x30Functions;

public class Functions {
    public static void main(String[] args) {
        System.out.println(funk(17,19));
        extension();
    }
    private static int funk(int x,int y){
        return x+y;
    }
    /*
    Write a Program with an add function and a multiply function.
    Use these functions to add 2 numbers together, then multiply
    them by 0.5
    */









    private static void extension(){
        int x = 73;
        int y = 94;
        System.out.println(multiply(funk(x,y),0.5));
    }

    private static double multiply(double a, double b ){
        return(a*b);
    }

}
