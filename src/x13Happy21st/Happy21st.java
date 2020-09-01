package x13Happy21st;

import java.util.Scanner;

public class Happy21st {
    public static void main(String[] args) {
        extension();
    }
    /*
    Task
    Ask the user their age. If they are 21,
    tell them they 'Happy Birthday'. If they
    are 22 tell them they are a Taylor Swift song


     */









    private static void extension(){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if(num==21){
            System.out.println("Happy 21st");
        }else if(num==22){
            System.out.println("You're a Taylor Swift song");
        }else{
            System.out.println("It only goes up?");
        }
    }
}
