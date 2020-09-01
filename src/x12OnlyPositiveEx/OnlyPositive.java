package x12OnlyPositiveEx;

import java.util.Scanner;

public class OnlyPositive {
    public static void main(String[] args) {
    extension();
    }


    /*
    Task
    Enter the code to reject a number if it is negative
     */









    private static void extension(){
    System.out.println("How old are you ?");
    Scanner input = new Scanner(System.in);
    int num = input.nextInt();
    String msg = num<0 ? "You were born "+num+" years ago ?" : "Well done";
    System.out.println(msg);


    }
}
