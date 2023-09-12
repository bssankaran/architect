package org.tw.bootcamp;

import java.util.Objects;

public class Length {
    private final double lengthInMeters;
    private final DistanceUnit defaultDistanceUnit;

    private Length(double length, DistanceUnit defaultDistanceUnit) {
        this.lengthInMeters = length;
        this.defaultDistanceUnit = defaultDistanceUnit;
    }

    public static Length ofCentimeter(double centimeter) {
        return new Length(centimeter / 100, DistanceUnit.CENTIMETER);
    }

    public static Length ofMeter(double meter) {
        return new Length(meter, DistanceUnit.METER);
    }

    public boolean same(Length length2) {
        return this == length2;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj instanceof Length) {
            return ((Length) obj).lengthInMeters == this.lengthInMeters;
        }

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(lengthInMeters);
    }

    public Length add(Length length2) {
        return new Length(lengthInMeters + length2.lengthInMeters, defaultDistanceUnit);
    }

    @Override
    public String toString() {
        return defaultDistanceUnit.magnitude(lengthInMeters) + defaultDistanceUnit.abbreviation();
    }
}
