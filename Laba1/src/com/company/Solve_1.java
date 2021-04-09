package com.company;

public class Solve_1 {
    private int power,square;
    public int a = 1;

    public Solve_1(int power, int square) {
        this.power = power;
        this.square = square;
    }

    public int getPower() {
        return this.power;
    }

    public int getSquare() {
        return this.square;
    }

    public void getRes() {
        for (int i = 0; i < this.getSquare(); i++) {
            this.a *= this.getPower();
        }
        System.out.println(this.a);
    }

}
