package com.company;

public class Solve_10 {
    private int a = 90;

    public int getData() {
        for (int i = 90; i > -1000; i--) {
            if (i >= 0) {
                System.out.print(i + " ");
            }
            else {
                System.out.println("Ostanovka");
                break;
            }
        }
        return this.a;
    }
}
