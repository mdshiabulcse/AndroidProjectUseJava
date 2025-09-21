package com.example.unitconverter;

public class MeterToCmConverter implements Converter {

    @Override
    public double convert(double value) {
        return value * 100; // override method from interface
    }
}
