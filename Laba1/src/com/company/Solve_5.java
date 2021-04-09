package com.company;

public class Solve_5 {
    private int a,b,sum = 0;

    public Solve_5(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void getSum() {
        for (int i = this.a; i <= this.b; i++) {
            this.sum += i;
        }
        System.out.println(this.sum);
    }
}
