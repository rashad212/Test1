package Practice.InputOutput;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File f = new File("aa.txt");
        FileReader fr = new FileReader(f);

        int c = fr.read();
        while(c!=-1){
            System.out.println(c + " ");
            c = fr.read();
        }
        fr.close();
    }
}
