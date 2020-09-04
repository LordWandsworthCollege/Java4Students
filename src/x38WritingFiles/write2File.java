package x38WritingFiles;
import java.io.*;
import java.util.*;
public class write2File {
    static private Formatter frm;
    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("dugong.txt", true);
            frm = new Formatter(fw);
        }catch(Exception e){
            System.out.println("Aaargh");
        }
        frm.format(" %s %d \n","Taylor",22);
        frm.close();
    }
}
/*
Write a program to record the name and phone
number ( cov-vid style )for all the diners
at McDonalds
 */
