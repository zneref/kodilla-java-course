package com.kodilla.zneref.rps.utils;

import java.util.concurrent.ThreadLocalRandom;

// util class for random ints in range [min,max]
public class RandomInts {
    public static int nextInt(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }
}
