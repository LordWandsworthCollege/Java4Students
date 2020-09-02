package x19ForLoops1;

public class ForLoops1 {
    public static void main(String[] args) {
        for(int x = 0;x<=12;x++){
            System.out.println(x);
        }
        extension();
    }


    /*
    Task
    Write a program to count down from 5.
    When it gets to zero, display , Here
    I come ready or not


     */









    private static void extension(){
        for(int x = 5;x>=0;x--){
            System.out.println(x);
        }
        System.out.println("Here I come, ready or not");
    }
}
