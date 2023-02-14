package com.clysman.Unifor.Calculator;

import com.clysman.Unifor.Person;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Imc extends Calculator {
    public Imc(Person person) {
        super(person);
    }

    @Override
    public void calc() {
        double imc = this.person.weigth()/Math.pow(this.person.stature(), 2);
        double imcFormated = BigDecimal.valueOf(imc).setScale(2, RoundingMode.HALF_UP).doubleValue();

        System.out.println("O seu imc é: " + imcFormated);
        System.out.println("A classificação pro seu IMC é: " + getClassification(imc));
    }

    private String getClassification(double imc) {
        if (imc < 18.5) {
            return "Magreza";
        }

        if (imc >= 18.5 && imc <= 24.9) {
            return "Normal";
        }

        if (imc >= 25 && imc <= 29.9) {
            return "Sobrepeso";
        }

        if (imc >= 30 && imc <= 39.9) {
            return "Obesidade";
        }
        
        return "Obesidade Grave";
    }
}
