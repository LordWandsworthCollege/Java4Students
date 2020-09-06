package x40CSV;

import java.io.FileWriter;
import java.io.IOException;

public class csv {

    String fName = "Giraffe.csv";
    String[] houses = {"Park","Gosden","Haygate"};
    int[] points ={15,13,19};
    public csv() throws IOException {
        writeCSV();
    }
    private void writeCSV() throws IOException {
           FileWriter write = new FileWriter(fName);
        for(int i = 0;i<4;i++) {
            write.append(houses + "," + points+"\n");
        }
    }
}

/*
Define a constructor

Define the term throws in Java
 */
