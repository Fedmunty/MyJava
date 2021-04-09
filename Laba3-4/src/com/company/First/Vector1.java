package com.company.First;

import com.company.Interfaces.Vector;
import com.company.SizeMismatchExceprion;


import java.util.Scanner;

public class Vector1 implements Vector {
    Scanner sc = new Scanner(System.in);

    private int n,sum = 0,a = 0, b = 0;
    private int[] arr = new int[2];

    @Override
    public void create() throws SizeMismatchExceprion {
        System.out.println("Input your vector");
        for (int i = 0; i < 2; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] < 0) throw new SizeMismatchExceprion();
        }
    }


    public void showValue() {

        for (int i = 0; i < 2; i++) {
            sum += arr[i];
        }

        System.out.println("SUM - " + sum);
    }

    @Override
    public int sum() {
        return a + b;
    }


    @Override
    public String сompare(){
        return arr[a] > arr[b] ? "true" : arr[a] < arr[b] ? "false" : arr[a] == arr[b]  ? "equvial" : "ERORR";
    }


    public String сompareVec(int a, int b){
        return a > b ? "true" : a < b ? "false" : a == b  ? "equvial" : "ERORR";
    }
}
