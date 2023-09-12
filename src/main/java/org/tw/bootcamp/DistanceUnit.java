package org.tw.bootcamp;

import java.util.function.Function;

public enum DistanceUnit {

    METER("m", 1),
    CENTIMETER("cm", 100);

    private final String abbreviation;
    private final double multiplicationFactor;

    DistanceUnit(String abbreviation, double multiplicationFactor) {
        this.abbreviation = abbreviation;
        this.multiplicationFactor = multiplicationFactor;
    }

    public String abbreviation() {
        return abbreviation;
    }

    public double magnitude(double lengthInMeters) {
        return multiplicationFactor * lengthInMeters;
    }
}
