package ru.mirea.task21;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class task4 {

    public static void main(String[] args) throws IOException {

        String pathDir = "C:\\Users\\prizm\\Desktop";
        String pathFile = "C:\\Users\\prizm\\Desktop\\thisText.txt";

        findFiles ff = new findFiles(pathDir);
        ff.WriteToFileList(pathFile);
        ff.ReadFile(pathFile, 5);
    }

}
