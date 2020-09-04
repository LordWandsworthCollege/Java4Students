package x20forEx1;

public class ForEx1 {
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

        Attempt to use printf as opposed to println to
        improve output
     */









    private static void extension(){
        for(int x = 0;x<=12;x++){
            System.out.printf("%2d x 12 = %d%n",x,x*12);

        }
    }
}
