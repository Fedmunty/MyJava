package com.company;
import java.util.Scanner;

public class Solve_31 {
    Scanner scanner = new Scanner(System.in);
    private int n,arr[];

    public void userSet() {
        System.out.println("Input chislo > 3");
        if (scanner.hasNextInt()) {
            do {
                this.n = scanner.nextInt();
                if (this.n < 4) {
                    System.out.println("ECHE RAZ VVODI");
                }
            }
            while (this.n < 4);
        }
        System.out.println(this.n);
        arr = new int [n];
        for (int i = 0; i < this.n; i++) {
            this.arr[i] = (int)(Math.random()*n);
            System.out.print(this.arr[i] + "    ");
        }
        System.out.println("    ");
        System.out.println("    ");
        for (int i = 0; i < this.n; i++) {
            if (this.arr[i] % 2 == 0) {
                System.out.print(this.arr[i] + "    ");
            }
        }

    }
}
