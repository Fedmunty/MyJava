package com.company.Second;

import com.company.Interfaces.Square;

public class Trapeci implements Square {
    double a, b, h;

    public Trapeci() {
        this.a = 4;
        this.b = 12;
        this.h = 6;
    }
    public Trapeci(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.h = c;
    }


    public double square() {
        return ((a + b) * h) / 2;
    }
}
