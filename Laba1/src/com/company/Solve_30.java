package com.company;

public class Solve_30 {
    private int arr[] = new int[12], colvoPol = 0, colovOtr = 0, i = 0;

    public void getArr() {
        do {
            for (int i = 0; i < this.arr.length; i++) {
               this.arr[i] = (int)(Math.random()*21)-10;
               if (arr[i] > 0) {
                   this.colvoPol++;
               }
               if (arr[i] < 0) {
                   this.colovOtr++;
               }
               if (arr[i] == 0) {
                   arr[i] = 6;
               }
               if (i == this.arr.length-1 && this.colovOtr != this.colvoPol) {
                   this.colvoPol = 0;
                   this.colovOtr = 0;
               }
            }
        }
        while (this.colovOtr != this.arr.length/2 && this.colvoPol != this.arr.length/2);


            for (int i = 0; i < this.arr.length; i++) {
                System.out.print(this.arr[i] + "     ");
            }

    }
}
