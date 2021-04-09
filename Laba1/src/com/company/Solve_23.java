package com.company;

public class Solve_23 {
    private int arr1[] = new int[6], arr2[] = new int[6];
    private double sum1, sum2;

    public void createArr(){
        for (int i = 0; i < this.arr1.length; i++) {
            this.arr1[i] = (int)((Math.random()*5) + 1 );
            System.out.print(this.arr1[i] + " ");
            this.sum1 += this.arr1[i];
        }
        System.out.println(" ");
        System.out.println("new mas");
        for (int i = 0; i < this.arr2.length; i++) {
            this.arr2[i] = (int)((Math.random()*5) + 1 );
            System.out.print(this.arr2[i] + " ");
            this.sum2 += this.arr2[i];
        }
        System.out.println(" ");
        System.out.println("sum1 : " + this.sum1 + " " + "sum2 : " + this.sum2);
        if ((this.sum1/6) > (this.sum2/6)) {
            System.out.println("Srednee1 bolshe chem sredneeArifm2");
        }
        else if ((this.sum1/6) == (this.sum2/6)) {
            System.out.println("srednie arifm ravni");
        }
        else if ((this.sum1/6) < (this.sum2/6)) {
            System.out.println("Srednee 1 menshe chem sredneeArifm2");
        }
    }

}
