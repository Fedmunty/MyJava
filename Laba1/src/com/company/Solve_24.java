package com.company;

public class Solve_24 {
    private int arr1[] = new int[4];

    public void createArr() {
        for (int i = 0; i < this.arr1.length; i++) {
            this.arr1[i] = (int) ((Math.random() * 89) + 10);
            System.out.print(this.arr1[i] + " ");
        }
        System.out.println("    ");
        System.out.println("    ");
        if (this.arr1[3] > this.arr1[2] && this.arr1[2] > this.arr1[1] && this.arr1[1] >this.arr1[0]) {
            System.out.println("vozrastaet");
        }
        else {
            System.out.println("ne vozrastaet");
        }
    }
}