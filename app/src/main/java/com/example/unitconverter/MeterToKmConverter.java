package com.example.unitconverter;

// Inheritance + Method Override
public class MeterToKmConverter implements Converter {

    @Override
    public double convert(double value) {
        return value / 1000; // override method from interface
    }
}