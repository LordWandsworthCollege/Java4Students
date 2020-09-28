package Variables;

import java.util.Scanner;
public class bInput {
    public void input(){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(s);
        int i = in.nextInt();
        System.out.print(i);
        System.out.println(s + " is " + i);
    }
    /*
    Extension Task

    Write a program to take the name of the customer
    and how many hot dogs they want. Print a receipt
     for them. Each hot dog costs £3.26
     */











    public void extension(){
        Scanner in = new Scanner(System.in);
        double hotDogs = 3.29;
        System.out.println("What is your name ?");
        String name = in.nextLine();
        System.out.println("How many hot dogs do you want ?");
        int num = in.nextInt();
        System.out.println(" ------ Mr M's Hot Dogs ------");
        System.out.println("");
        System.out.println("  "+name+" ordered "+num+" Hot dogs ");
        System.out.println("");
        System.out.println(" £"+ hotDogs*num);
        System.out.println(" -----------------------------");


    }


}
