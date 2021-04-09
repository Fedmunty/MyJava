package com.company;

public class Solve_6 {
    private int a, b, sum = 0,k;

    public Solve_6(int a,int b,int k) {
        this.a = a;
        this.b = b;
        this.k = k;
    }

    public void getSum() {
        for (int i = a; i <= b; i++) {
            if (i % k == 0){
                sum += i;
            }
        }
        System.out.println(this.sum);
    }


}
