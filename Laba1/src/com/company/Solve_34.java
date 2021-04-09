package com.company;
import java.util.Scanner;

public class Solve_34 {
    Scanner scanner = new Scanner(System.in);
    private int arr[][],n,counter = 0, sum = 0;

    public void getArr(){
        if (scanner.hasNextInt()) {
            this.n = scanner.nextInt();
        }
        arr = new int [n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = (int)(Math.random()*10);

                System.out.print(arr[i][j] + " ");

            }
            System.out.println(" ");
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i][j] > 0) {
                    this.counter++;
                    this.sum += this.arr[i][j];
                }
            }
        }

        System.out.println("COUNTER" + this.counter);
        System.out.println("SUM = " + this.sum);
    }
}
