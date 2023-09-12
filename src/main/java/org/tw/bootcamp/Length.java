package org.tw.bootcamp;

import java.util.Objects;
import java.util.function.Supplier;

public class Length {
    private final double lengthInMeters;
    private final DistanceUnit distanceUnit;

    private Length(double length, DistanceUnit distanceUnit) {
        this.lengthInMeters = length;
        this.distanceUnit = distanceUnit;
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
        return new Length(lengthInMeters + length2.lengthInMeters, distanceUnit);
    }

    @Override
    public String toString() {
        return distanceUnit.magnitude(lengthInMeters) + distanceUnit.abbreviation();
    }
}
