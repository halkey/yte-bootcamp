package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Checked {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("E://file.txt");
        FileReader fr = new FileReader(file); //java.io.FileNotFoundException: E:/file.txt (No such file or directory)
    }
}