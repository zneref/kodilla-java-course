package com.kodilla.zneref.exception.main;

import com.kodilla.zneref.exception.io.FileReader;
import com.kodilla.zneref.exception.io.FileReaderException;
import com.kodilla.zneref.exception.io.FileReaderWithoutHandling;

import java.io.IOException;

public class ExceptionModuleRunner {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader();
        try {
            fileReader.readFile();
        } catch (FileReaderException e) {
            e.printStackTrace();
        }
        FileReaderWithoutHandling f = new FileReaderWithoutHandling();
        f.readFile();
    }
}
