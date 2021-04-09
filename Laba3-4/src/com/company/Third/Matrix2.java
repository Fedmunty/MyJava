package com.company.Third;

import com.company.Interfaces.Norma;

import java.util.Random;

public class Matrix2 implements Norma {
    int[][] arr = new int[2][2];

    Random rand = new Random();

    public void creatMatrix() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = rand.nextInt((50 - 20) + 1) - 20;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    @Override
    public void norma() {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (Math.abs(arr[i][j]) > Math.abs(max)) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println(" ");
        System.out.println(max);
    }
}
