package com.company;

public class Solve_39 {
    private int n,arr[][];
    public void getRes() {
        this.n = 4;
        this.arr = new int [this.n][this.n];
        for (int i = 0; i < this.n; i++) {
            for (int j =0; j < this.n; j++) {
                this.arr[i][j] = (int)((Math.random()*10) - 5);
                System.out.print(this.arr[i][j] + " ");
                if (this.arr[i][j] < 0) {
                    this.arr[i][j] = 0;
                }
                else {
                    this.arr[i][j] = 1;
                }
            }
            System.out.println("   ");
            System.out.println("    ");
        }
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < this.n; j++) {
                System.out.print(this.arr[i][j] + " ");
            }
            System.out.println("    ");
        }
    }
}
