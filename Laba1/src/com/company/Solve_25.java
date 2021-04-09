package com.company;

public class Solve_25 {
    private int a = 1,b = 1,sum = 0;

    public void getFibonahi() {
        for (int i = 2; i < 22; i++) {
            this.sum = this.a + this.b;
            this.a = this.b;
            this.b = this.sum;
            System.out.println(this.sum);
        }
    }
}
