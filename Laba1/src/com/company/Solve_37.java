package com.company;
import java.util.Scanner;

public class Solve_37 {
    Scanner scanner = new Scanner(System.in);
    private int arr[][],n,m,max,min,temp;
    public void getArr() {
        System.out.println("Input colvo rows");
        if (scanner.hasNextInt()) {
            this.n = scanner.nextInt();
        }
        System.out.println("Input colvo columns");
        if (scanner.hasNextInt()) {
            this.m = scanner.nextInt();
        }
        this.arr = new int [this.n][this.m];
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < this.m; j++) {
                this.arr[i][j] = (int)(Math.random()*10);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("    ");
        this.min = this.arr[0][0];
        this.max = -1000;
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < this.m; j++) {
                if (this.arr[i][j] > this.max) {
                    this.max = this.arr[i][j];
                    this.max = j;
                }
                if (this.arr[i][j] < this.min) {
                    this.min = j;
                }
            }
        }
        System.out.println(this.max + " MAX");
        System.out.println(this.min + "MIN");

    }

}
