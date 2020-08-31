package x03Input;
import java.util.Scanner;
public class NeedInput {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("What's your name ?");
    String Name = input.nextLine();
    System.out.println("How many of you are there?");
    int num = input.nextInt();
    System.out.println(" Hi "+ Name + ".There are "+num+" of you");
    extension();
    }

    /*
    Task
    Write a program to ask for 2 numbers, then add them together
     */









    private static void extension(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first Number");
        int a = input.nextInt();
        System.out.println("Enter Second Number");
        int b = input.nextInt();
        System.out.println("The answer is "+ (a+b));
    }
}
