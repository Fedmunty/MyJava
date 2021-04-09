package com.company;

public class Solve_38 {
    private int sumStlb[], sumRow[], n = 4,arr[][],arr2[][],temp = 0;

    public void getRes() {
        this.sumRow = new int [n];
        this.sumStlb = new int [n];
        this.arr = new int[this.n][this.n];
        this.arr2 = new int[this.n][this.n];
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < this.n; j++) {
                this.arr[i][j] = (int)(Math.random()*10);
                System.out.print(this.arr[i][j] + " ");
            }
            System.out.println("    ");
        }
        for (int j = 0; j < this.n; j++) {
            this.sumStlb[j] = 0;
            for (int i = 0; i < this.n; i++) {
                this.sumStlb[j] += this.arr[i][j];
            }
            System.out.println("Stolbec " + j + " : " + this.sumStlb[j]);
        }
        for (int i = 0; i < this.n; i++) {
            this.sumRow[i] = 0;
            for (int j = 0; j < this.n; j++) {
                this.sumRow[i] += this.arr[i][j];
            }
            System.out.println("row " + i + " : " + this.sumRow[i]);
        }
        System.out.println("   ROW     ");
        for (int i = 0; i < this.n; i++) {
            System.out.print(this.sumRow[i] + " ");
        }
        System.out.println(" ");
        System.out.println("   COL  ");
        for (int i = 0; i < this.n; i++) {
            System.out.print(this.sumStlb[i] + " ");
        }
        for (int i = 0; i < this.n; i++) {
            if (this.sumRow[0] == this.sumStlb[i] && this.sumStlb[1] == this.sumStlb[i] && this.sumRow[2] == this.sumStlb[i] && this.sumRow[3] == this.sumStlb[i]) {
                System.out.println("<MAGIC kvadro");
            }
        }
    }
}
