package com.kodilla.zneref.stream.beautifier;

import java.util.function.Function;

public class PoemBeautifierWithNativeJava {
    public void beautify(String poem, Function<String, String> decorate) {
        System.out.println(decorate.apply(poem));
    }
}
