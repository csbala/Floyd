package program.code;

import java.io.*;

public class FileHandling {

    File file;
    PrintWriter pw;

    FileHandling() throws IOException {

        file = new File("Floyd.txt");

        if (!file.exists()) { file.createNewFile(); }

         pw = new PrintWriter(file);

    }

    void close(){
        pw.close();
    }

    void print(String s){
        pw.print(s);
    }

    void println(String s){
        pw.println(s);
    }

}
