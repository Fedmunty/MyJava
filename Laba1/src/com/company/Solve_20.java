package com.company;

public class Solve_20 {
    private int randNumb, a, b, c;

    public void findMore() {
        this.randNumb = (int)(Math.random()*900) + 100;
        System.out.println(this.randNumb);
        this.a = this.randNumb / 100;
        this.b = this.randNumb % 100 / 10;
        this.c = this.randNumb % 10;
        if (this.a > this.b && this.a > this.c) {
            System.out.println(this.a);
        }
        else if (this.b >= this.a && this.b >= this.c) {
            System.out.println(this.b);
        }
        else if (this.c >= this.a && this.c >= this.b) {
            System.out.println(this.c);
        }
    }

}
