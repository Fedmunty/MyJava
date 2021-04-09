package com.company;
import java.util.Scanner;

public class Solve_36 {
    Scanner scanner = new Scanner(System.in);
    private int arr[][],arr2[][],n,numRow,max,temp;

    public void getArr() {
        System.out.println("Input size of mass");
        if (scanner.hasNextInt()) {
            this.n = scanner.nextInt();
        }
        this.arr = new int [this.n][this.n];
        this.arr2 = new int [this.n][this.n];
        for (int i = 0; i < this.n; i++){
            for (int j = 0; j < this.n; j++) {
                this.arr[i][j] = (int)(Math.random()*10);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("Vtoroy mass");
        for (int i = 0; i < this.n; i++){
            for (int j = 0; j < this.n; j++) {
                this.arr2[i][j] = this.arr[i][j];
                System.out.print(this.arr2[i][j] + " ");
            }
            System.out.println("  ");
        }
        System.out.println("Input number row");
        if (scanner.hasNextInt()) {
            this.numRow = scanner.nextInt();
        }
        System.out.println("    ");
        System.out.println("   er     ");

        for (int i = 0; i < this.n; i++) {
            for (int j = i; j < this.n; j++) {
                if (j == i) {
                    if (this.arr[i][j] > this.max) {
                        this.max = this.arr[i][j];
                        this.temp = i;
                    }
                }
            }
        }

        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < this.n; j++) {

                this.arr2[this.temp][j] = this.arr[this.numRow][j];
                this.arr2[this.numRow][j] = this.arr[this.temp][j];

            }
        }

        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < this.n; j++) {
                System.out.print(this.arr2[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println("    ");
        System.out.println("    ");
        System.out.println(this.max);
        System.out.println(this.temp);
    }
}
