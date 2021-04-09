package com.company;

public class Solve_22 {
    private int arr[] = new int[8];

    public void createArr() {
        for (int i = 0; i < this.arr.length; i++) {
            this.arr[i] = (int)((Math.random()*10) + 1 );
            System.out.print(this.arr[i] + " ");
        }
        System.out.println("NEWWWW MASSS");
        for (int i = 0; i < this.arr.length; i++) {
            if (i % 2 != 0) {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }

    }
}
