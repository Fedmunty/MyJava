package com.company.First;

import com.company.Interfaces.Arifmetic;
import com.company.SizeMismatchExceprion;

import java.util.Random;
import java.util.Scanner;

public class Matrix implements Arifmetic {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();


    public Matrix() {
        this.n = 3;
        System.out.println("Input size of arr");
    }

    public Matrix(int sizeOfArr) {
        this.n = sizeOfArr;
        System.out.println("Input size of arr");
    }
    int n = sc.nextInt();

    private int[][] arr = new int [n][n];


    @Override
    public int sum(){
        int a = 0, b = 1;
        System.out.println("Input first value :");
        if(sc.hasNextInt()) { a = sc.nextInt(); }
        System.out.println("Input second value :");
        if(sc.hasNextInt()) { b = sc.nextInt(); }

        return a + b;
    }


    @Override
    public String сompare(){
        int a = 0, b = 1;
        System.out.print("Input first value :");
        if(sc.hasNextInt()) { a = sc.nextInt(); }
        System.out.println(" > ");
        System.out.print("Input second value :");
        if(sc.hasNextInt()) { b = sc.nextInt(); }

        return a > b ? "true" : a < b ? "false" : a == b ? "equvial" : "ERORR";
    }


    @Override
    public void create() {
        if (n > 10 || n < 1) throw new NullPointerException("Input correct number a > 1 && a < 10!");
        System.out.println("Input value of mass");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }


    public void setRandValue() {
        if (n > 10 || n < 1) throw new NullPointerException("Input correct number a > 1 && a < 10!");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = rand.nextInt((10 - 0) + 1) + 0;
            }
        }
    }


    public void showValue() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
    }


    public void getValueOfIndex() throws SizeMismatchExceprion {
        int row = 0;
        int column = 0;
        System.out.println("Input number row and coll");
        if(sc.hasNextInt()) {
            row = sc.nextInt();
            column = sc.nextInt();
        }
        else {
            System.out.println("Not correct input,plese repeat");
        }

        if ((row < 0 && row > n) && (column < 0 && column > n)) {
            throw new SizeMismatchExceprion();
        }

        System.out.println(arr[row][column]);
    }


    public void scale() {
        int scaleNumber = 0;
        System.out.println("Input scaled number :");
        if(sc.hasNextInt()) { scaleNumber = sc.nextInt(); }
        else { System.out.println("Not correct input,plese repeat"); }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] *= scaleNumber;
            }
        }
    }

}
