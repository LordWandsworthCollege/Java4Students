package x04VariablesEx;
import java.util.Scanner;
/*
 Task
You are making a till for a hot dog stand.
Ask the user how many hot dogs they would
like, then display a receipt for the total
price

  */
public class VariablesExercise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double hotDogs = 3.29;
        System.out.println("What is your name ?");
        String name = in.nextLine();
        System.out.println("How many hot dogs do you want ?");
        int num = in.nextInt();
        System.out.println(" ------ Mr M's Hot Dogs ------");
        System.out.println("");
        System.out.printf(" %5s ordered %2d Hot dogs ",name,num);
        System.out.println("");
        System.out.printf(" £%.2f %n %n -----------------------------", (hotDogs*num));

    }

}
