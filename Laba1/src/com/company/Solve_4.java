package com.company;
import java.util.Scanner;

public class Solve_4 {
    Scanner scanner = new Scanner(System.in);
    private int a;

    public int inputPass() {
        this.a = scanner.nextInt();
        if(this.a != 1234) {
            System.out.println("Vvedite eche raz");
            return inputPass();
        }
        else{
            System.out.println("vse verno");
            return a;

        }
    }
}
