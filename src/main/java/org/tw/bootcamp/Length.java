package org.tw.bootcamp;

import java.util.Objects;

public class Length {
    private final double length;

    private Length(double length) {
        this.length = length;
    }

    public static Length ofCentimeter(double length) {
        return new Length(length/100);
    }

    public static Length ofMeter(double length) {
        return new Length(length);
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
            if (((Length) obj).length == this.length) {
                return true;
            }
        }

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this);
    }
}
