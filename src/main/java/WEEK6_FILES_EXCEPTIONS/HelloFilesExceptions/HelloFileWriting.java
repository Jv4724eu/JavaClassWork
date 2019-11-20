package WEEK6_FILES_EXCEPTIONS.HelloFilesExceptions;

import java.io.*;

public class HelloFileWriting {
        public static void main(String[] args) throws IOException {
            FileWriter writer = new FileWriter("hello.txt");
            BufferedWriter bufWriter = new BufferedWriter(writer);
            bufWriter.write("Hello\n");
            bufWriter.write("Data here\n");
            bufWriter.write("goodbye\n");
            bufWriter.close();



            /**FileReader reader = new FileReader("hello.txt");
            BufferedReader bufReader = new BufferedReader(reader); **/
            //condensed version below V

            BufferedReader bufReader =new BufferedReader(new FileReader("hello.txt"));

            //read the first line
            String line = bufReader.readLine();

            while (line != null){
                System.out.println(line);

                line = bufReader.readLine();
            }

            bufReader.close();


        }

    }
