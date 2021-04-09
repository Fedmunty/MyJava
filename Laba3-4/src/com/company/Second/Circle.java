package com.company.Second;

import com.company.Interfaces.Square;

public class Circle implements Square {
    double r,square;

    public Circle(){
        this.r = 5;
    }
    public Circle(int r) {
        this.r = r;
    }


    public double square(){
        square = Math.PI * r * r;
        return square;
    }
}
