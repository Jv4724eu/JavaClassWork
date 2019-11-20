package WEEK6_FILES_EXCEPTIONS.HelloFilesExceptions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class writeVariables {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("variables.txt");
        BufferedWriter bufwriter = new BufferedWriter(writer);

        int intData = 42;
        double dblData = 987.654;
        String strData = "Java";

        bufwriter.write(intData + "\n");
        bufwriter.write(dblData + "\n");
        bufwriter.write(strData + "\n");

        bufwriter.close();



    }
}
