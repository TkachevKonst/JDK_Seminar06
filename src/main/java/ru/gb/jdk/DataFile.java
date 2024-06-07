package ru.gb.jdk;


import java.io.FileWriter;
import java.io.IOException;

public class DataFile {


    public void saveInfo(String text, String name) {
        try (FileWriter writer = new FileWriter(name+".txt", true)) {
            writer.write(text);
            writer.write("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
