package com.kodilla.zneref.exception.io;

import io.vavr.control.Try;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReaderWithoutHandling {
    public void readFile() {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("file/names.txt").getFile());
        Try<Stream<String>> result = Try.of(()->Files.lines(Paths.get(file.getPath())));
       // Stream<String> fileLines = Files.lines(Paths.get(file.getPath()));

        result.get().forEach(System.out::println);

    }
}
