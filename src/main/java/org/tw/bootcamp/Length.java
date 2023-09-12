package org.tw.bootcamp;

import java.util.Objects;

public class Length {
    private final double lengthInMeters;
    private final DistanceUnits distanceUnits;

    private Length(double length) {
        this.lengthInMeters = length;
    }

    public static Length ofCentimeter(double centimeter) {
        return new Length(centimeter/100);
    }

    public static Length ofMeter(double meter) {
        return new Length(meter);
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
        return  Length.ofMeter(lengthInMeters+length2.lengthInMeters);
    }

   @Override
    public String toString(){

        return String.valueOf(lengthInMeters)+"m";

   }
}
