package com.company;

public class Solve_8 {
    private int a, b , h;

    public Solve_8(int a, int b, int h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    public void getFourDigitNumber(){
        for (int i = this.a; i <= this.b; i += this.h) {
            System.out.println(i);
        }
    }

}
