package com.company;

public class Solve_26 {
    private int arr[] = new int[12],max = -50,index;

    public void createArr() {
        for (int i = 0; i < this.arr.length; i++) {
            this.arr[i] = (int) ((Math.random() * 31) - 16);
            System.out.print(this.arr[i] + " ");
            if (this.arr[i] > this.max) {
                this.max = this.arr[i];
                this.index = i;
            }
        }
        System.out.println(" ");
        System.out.println("max : " + this.max + "  Index = " + this.index);
    }
}
