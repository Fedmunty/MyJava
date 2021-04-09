package com.company;
import java.util.Scanner;

public class Solve_13 {
    private int num, b;
    Scanner scanner = new Scanner(System.in);


    public void getDel() {
        if (scanner.hasNextInt()) {
            this.num = scanner.nextInt();
        }
        for (int i = 1; i <= this.num; i++) {
            if(this.num % i == 0) {
                System.out.println(i);
            }
        }
    }
}
