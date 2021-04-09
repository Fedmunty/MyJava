package com.company;

public class Solve_33 {
    private int arr1[][],max = 0,row_index;

    public void setArr() {
        arr1 = new int [6][7];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                this.arr1[i][j] = (int)(Math.random()*10);
                System.out.print(this.arr1[i][j] + "  ");
                if (j == 0) {
                    this.max = arr1[i][j];
                }
                else {
                    if (this.arr1[i][j] > this.max) {
                        this.max = this.arr1[i][j];
                        this.row_index = j;
                    }
                }
                if (j == arr1[i].length - 1) {
                    int temp = arr1[i][0];
                    this.arr1[i][0] = this.arr1[i][row_index];
                    this.arr1[i][row_index] = temp;
                }

            }
            System.out.println("    ");
        }
        System.out.println(this.max);

        for (int i = 0; i < 6; i++) {
            for (int j =0; j < 7; j++) {
                System.out.print(this.arr1[i][j] + " ");
            }
            System.out.println("    ");
        }
    }

}
