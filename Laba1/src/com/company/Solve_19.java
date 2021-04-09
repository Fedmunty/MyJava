package com.company;

public class Solve_19 {
    private int arr[],numberRand;
    public void chekAim() {
        this.arr = new int [126];

        this.numberRand = (int)(Math.random()*150+1)+5;
        System.out.println(this.numberRand);

        if (this.numberRand > 25 && this.numberRand < 100) {
            System.out.println("Number in promejutok (25,100)");
        }
        else {
            System.out.println("Number ne popalo v (25,100)");
        }
    }
}
