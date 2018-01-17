package com.kodilla.zneref.stream.beautifier;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class PoemBeautifierWithNativeJava {
    public void beautify(String poem, UnaryOperator<String> decorate) {
        System.out.println(decorate.apply(poem));
    }
}
