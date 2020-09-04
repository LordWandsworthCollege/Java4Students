package x36ReadFiles;
import java.util.Scanner;
public class ReadFiles {
    public static void main(String[] args) {
    try{
        Scanner myReader = new Scanner("src/x36ReadFiles/avaMax.txt");
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            System.out.println(data);
        }
        myReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /* Try and modify the code above to only
    produce the first 10 lines of the song
    */









    private void extension(){

    }
}
