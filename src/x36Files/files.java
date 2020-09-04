package x36Files;
import java.io.File;
public class files {

    public static void main(String[] args) {
    File x = new File("x36Files/UFO.txt");

    if(x.exists()){
        System.out.println(x.getName() + " exists");
    }else{
        System.out.println("Where is it ?");
    }
    }
}
