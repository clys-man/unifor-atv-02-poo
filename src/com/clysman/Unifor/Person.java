package com.clysman.Unifor;

import java.time.Year;

public record Person(String name, int birthYear, double weigth, double stature) {
    public Person {
        if (birthYear > Year.now().getValue()) {
            throw new IllegalArgumentException("Invalid Year!");
        }

        if (weigth < 0 || stature < 0) {
            throw new IllegalArgumentException("Weight or stature can't be negative!");
        }
    }

    public int age() {
        return Year.now().getValue() - this.birthYear;
    }
}
