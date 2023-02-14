package com.clysman.Unifor.Calculator;

import com.clysman.Unifor.Person;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Water  extends Calculator {
    public Water(Person person) {
        super(person);
    }

    @Override
    public void calc() {
        int age = person.age();
        double ml = getMlByAge(age);
        double litersByAge = (ml/1000) * person.weigth();

        litersByAge = BigDecimal.valueOf(litersByAge).setScale(2, RoundingMode.HALF_UP).doubleValue();

        System.out.println("Idade: " + age);
        System.out.println("Litros de água por dia: " + litersByAge);
    }

    private int getMlByAge(int age) {
        if (age <= 17) {
            return 40;
        }

        if (age <= 55) {
            return 35;
        }

        if (age <= 65) {
            return 30;
        }

        return 25;
    }
}
