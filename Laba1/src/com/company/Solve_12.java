package com.company;

public class Solve_12 {
    public void getData() {
        for(int a = -166; a < 100; a = 2 * a + 200){
            if (a > -100 && (a < -9 || a > 9)) {
                System.out.print(a + " ");
            }
        }
    }
}