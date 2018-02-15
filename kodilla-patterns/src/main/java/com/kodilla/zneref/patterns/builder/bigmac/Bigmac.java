package com.kodilla.zneref.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public final class Bigmac {
    private final String roll;
    private final int burgers;
    private final String sauce;
    private final List<String> ingrients;

    private Bigmac(String roll, int burgers, String sauce, List<String> ingrients) {
        this.roll = roll;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingrients = new ArrayList<>(ingrients);
    }

    public static class BigmacBuilder {
        private String roll;
        private int burgers;
        private String sauce;
        private List<String> ingrients = new ArrayList<>();

        public BigmacBuilder roll(String roll) {
            this.roll = roll;
            return this;
        }

        public BigmacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder ingrient(String ingrient) {
            ingrients.add(ingrient);
            return this;
        }

        public Bigmac build() {
            return new Bigmac(roll, burgers, sauce, ingrients);
        }
    }

    public String getRoll() {
        return roll;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngrients() {
        return ingrients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "roll='" + roll + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingrients=" + ingrients +
                '}';
    }
}
