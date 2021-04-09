package com.company.Third;

import com.company.Interfaces.Norma;

public class Complex implements Norma {
    private double x, y;
    public Complex() {
        this.x = -5;
        this.y = 15;
    }

    public Complex(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void norma(){
        double res = 0;

        res =  Math.sqrt( (x * x) + (y * y) );
        System.out.println(Math.abs(res));
    }
}
