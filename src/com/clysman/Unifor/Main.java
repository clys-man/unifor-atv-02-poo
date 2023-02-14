package com.clysman.Unifor;

import com.clysman.Unifor.Calculator.Imc;
import com.clysman.Unifor.Calculator.Water;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Teste", 1992, 65.87, 1.70);
        Imc imc = new Imc(person);
        imc.calc();

        Water water = new Water(person);
        water.calc();
    }
}