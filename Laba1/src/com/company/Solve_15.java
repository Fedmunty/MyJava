package com.company;

public class Solve_15 {
    private int a = 1,b = 1,sum = 0;

    public void getFibonahi() {
        for (int i = 2; i < 12; i++) {
            this.sum = this.a + this.b;
            this.a = this.b;
            this.b = this.sum;
            System.out.println(this.sum);
        }
    }

}
//i[0]     i[1]     i[2]        i[3]        i[4]        i[5]        i[6]        i[7]    i[8]    i[9]    i[10]
//  0       1         2           3         4           5            6         7        8         9       10