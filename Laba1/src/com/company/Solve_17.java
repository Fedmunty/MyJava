package com.company;

public class Solve_17 {
    private int num1,num2,num3,num4,num5,num6,sumNum = 0,colvo = 0;

    public Solve_17() {

    }

    public void luckiTicket() {

        for (int i = 99991; i < 999999; i++) {
            this.num1 = i / 100000;
            this.num2 = (i / 10000) % 10;
            this.num3 = (i / 1000) %10%10;
            this.num4 = (i / 100) %10%10%10;
            this.num5 = (i / 10) %10%10%10%10;
            this.num6 = i%10%10%10%10;
            if ((this.num1 + this.num2 + this.num3) == (this.num4 + this.num5 + this.num6)) {
                System.out.println(i);
                colvo++;
            }
        }
        System.out.println("kolvo ticket : " + this.colvo);
    }
}
