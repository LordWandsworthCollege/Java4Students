package x37CreatingFiles;
import java.util.*;


public class createFiles {
    public static void main(String[] args) {
        Formatter x;
        try{
         x = new Formatter("Geronimo.txt");
        }catch(Exception e){
            System.out.println(e);
        }

    }
}
