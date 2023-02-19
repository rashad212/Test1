package Practice.InputOutput22;


import java.io.*;

public class FileIO {
    public static void main(String[] args) {

        String[] names = {"John", "Carl", "Andrew"};
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("Writing to a file.");
            writer.write("\nThis is second line.");

            for (String name : names) {
                writer.write("\n" + name);
            }
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);}


        try {
            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
            String line;
            while((line = reader.readLine()) !=null){
                System.out.println(line);
            }
            System.out.println(reader.readLine());
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
