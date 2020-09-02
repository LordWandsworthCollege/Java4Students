package x17WhileEx1;

public class WhileEx1 {
    public static void main(String[] args) {
        extension();
    }


    /*
    Task

    Write a Loop to display the 12 times table
    e.g.
        1 x 12 = 12
        2 x 12 = 24
        3 x .....


     */









    private static void extension(){
        int x=1;
        while(x<13){
            System.out.printf("%2d x 12 = %d%n",x,x*12);
            x++;
        }
    }
}
