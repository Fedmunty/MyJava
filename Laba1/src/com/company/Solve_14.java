package com.company;
import java.util.Scanner;

public class Solve_14 {
    private int a;
    Scanner scanner = new Scanner(System.in);

    public void getData() {
        if(scanner.hasNextInt()) {
            this.a = scanner.nextInt();
        }
        for (int i = (int)Math.sqrt(this.a); i >= 1; i--) {
            if (this.a % i == 0 && i != 1) {
                System.out.println("Sostavnoe");
                System.out.println((int)Math.sqrt(11));
                break;            }
            if (i == 1){
                System.out.println("Prost chislo");
            }
        }
    }

}
