package com.clysman.Unifor.Calculator;

import com.clysman.Unifor.Person;

abstract class Calculator implements CalculatorInterface {
    protected final Person person;

    public Calculator(Person person) {
        this.person = person;
    }
}
