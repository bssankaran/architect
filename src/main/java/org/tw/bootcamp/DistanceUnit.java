package org.tw.bootcamp;

import java.util.function.Function;

public enum DistanceUnit {

    METER("m", 1, Length::ofMeter),
    CENTIMETER("cm", 100, Length::ofCentimeter);

    private final String abbreviation;
    private final double factor;
    private final Function<Double, Length> lengthFactory;

    DistanceUnit(String abbreviation, double factor, Function<Double, Length> lengthFactory) {
        this.abbreviation = abbreviation;
        this.factor = factor;
        this.lengthFactory = lengthFactory;
    }

    public String abbreviation() {
        return abbreviation;
    }

    public double magnitude(double lengthInMeters) {
        return factor * lengthInMeters;
    }

    public Function<Double, Length> lengthFactory() {
        return lengthFactory;
    }
}
