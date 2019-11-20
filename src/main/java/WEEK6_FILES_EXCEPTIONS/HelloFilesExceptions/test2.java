package WEEK6_FILES_EXCEPTIONS.HelloFilesExceptions;

import java.io.*;

public class test2 {
    public static void main(String[] args) throws IOException {
        String fileName = "months.txt";
        String[] months = {"Jan", "Feb", "Mar"};

        BufferedWriter bufwriter = new BufferedWriter(new FileWriter(fileName));

        for (String item : months){
            bufwriter.write(item);
        }
        bufwriter.close();

        BufferedReader bReader = new BufferedReader(new FileReader(fileName));

        String line = bReader.readLine();

        while (line != null) {
            line = bReader.readLine();
        }
        bReader.close();
    }
}
