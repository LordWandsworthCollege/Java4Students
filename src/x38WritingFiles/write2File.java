package x38WritingFiles;
import java.util.*;

public class write2File {
    static private Formatter frm;
    public static void main(String[] args) {
        try{
            frm = new Formatter("dugong.txt");
        }catch(Exception e){
            System.out.println("Bucky");
        }

        frm.format(" %s %d","Taylor",22);
        frm.close();


    }

}
