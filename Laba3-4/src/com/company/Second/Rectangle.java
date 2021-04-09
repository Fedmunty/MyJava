package com.company.Second;


import com.company.Interfaces.Square;

public class Rectangle implements Square {
    int a,b;

    public Rectangle() {
        this.a = this.b = 4;
    }

    public Rectangle(int a, int b) {
        this.a = a;
        this. b = b;
    }


    public double square() {
        return a * b;
    }
}
