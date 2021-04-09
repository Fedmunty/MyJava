package com.company.Second;

import com.company.Interfaces.Square;

public class Triangle implements Square {
    double a ,b;
    public Triangle() {
        this.a = this.b = 7;
    }
    public Triangle(double a, double b) {
        this.a = a;
        this.b = b;
    }


    public double square() {
        return (a * b) / 2;
    }
}
