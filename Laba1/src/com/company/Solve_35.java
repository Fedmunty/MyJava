package com.company;
import java.util.Scanner;

public class Solve_35 {
    Scanner scanner = new Scanner(System.in);

    private int arr[][],x,y,k;

    public void getArr() {
        
        System.out.println("Input rows mass");
        if (scanner.hasNextInt()) {
            this.x = scanner.nextInt();
        }
        System.out.println("Input colss mas");
        if (scanner.hasNextInt()) {
            this.y = scanner.nextInt();
        }

        this.arr = new int [x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                arr[i][j] = (int)(Math.random()*10);
                System.out.print(this.arr[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

}
