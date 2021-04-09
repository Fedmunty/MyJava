package com.company;

public class Solve_27 {
    private int arr1[] = new int[10], arr2[] = new int[10],colvo = 0;
    private double arr3[] = new double[10];

    public void createArr(){
        for (int i = 0; i < this.arr1.length; i++) {
            this.arr1[i] = (int)((Math.random()*9) + 1 );
            System.out.print(this.arr1[i] + "     ");
        }
        System.out.println("    ");
        System.out.println("    ");
        for (int i = 0; i < this.arr2.length; i++) {
            this.arr2[i] = (int)((Math.random()*9) + 1 );
            System.out.print(this.arr2[i] + "     ");
        }
        System.out.println("     ");
        System.out.println("    ");
        for (int i = 0; i < this.arr3.length; i++) {
            this.arr3[i] = (this.arr1[i]* 1.0) / (this.arr2[i] * 1.0) ;
            System.out.print(this.arr3[i]  +  "   ");
            if (this.arr1[i] % this.arr2[i] == 0) {
                this.colvo++;
            }
        }
        System.out.println("    ");
        System.out.println("Colvo elem =" + this.colvo);

    }

}
