package WEEK6_FILES_EXCEPTIONS.HelloFilesExceptions;

import java.io.*;

public class test1 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bufWrite = new BufferedWriter(new FileWriter("me.txt"));
        bufWrite.write("Kelsey\n");
        bufWrite.write("pastel pink\n");
        int classCode = 2545;
        bufWrite.write(classCode + "\n");
        bufWrite.close();

        BufferedReader bufReader =new BufferedReader(new FileReader("me.txt"));

        String line = bufReader.readLine();

        while (line != null){
            System.out.println(line);

            line = bufReader.readLine();
        }



        bufReader.close();

    }
}
