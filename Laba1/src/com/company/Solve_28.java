package com.company;

public class Solve_28 {
    private int arr1[] = new int[11],sumMinus1=0,sum0=0,sumPlus1=0;

    public void createArr(){
        for (int i = 0; i < this.arr1.length; i++) {
            this.arr1[i] = (int)((Math.random()*(4)) - 2 );
            System.out.print(this.arr1[i] + "    ");
            if (this.arr1[i] < 0) {
                this.sumMinus1++;
            }
            else if (this.arr1[i] == 0) {
                this.sum0++;
            }
            else if (this.arr1[i] > 0) {
                this.sumPlus1++;
            }
        }
        if(this.sumMinus1 > this.sum0 && this.sumMinus1 > this.sumPlus1)
            System.out.println("Чаще всего встречается -1");
        if(this.sum0 > this.sumMinus1 && this.sum0 > this.sumPlus1)
            System.out.println("Чаще всего встречается 0");
        if(this.sumPlus1>this.sumMinus1 && this.sumPlus1 > this.sum0)
            System.out.println("Чаще всего встречается 1");
    }
}
