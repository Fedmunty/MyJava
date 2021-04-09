package com.company.First;

import com.company.Interfaces.String1;

import java.util.Scanner;

public class Char1 implements String1 {
    Scanner scan = new Scanner(System.in);
    private int e = 0;
    private String arr;

    public Char1() {
        this.arr = "halllo";
    }

    public Char1(String arr) {
        this.arr = arr;
    }

    @Override
    public void create(){
        System.out.println("Input your line");
        if (scan.hasNextLine()){
            arr = scan.nextLine();
        }
        else {
            System.out.println("Not correct input, please repet");
        }

    };

    public void showValue(){
        System.out.println(arr);
    };


    @Override
    public void getValueOfIndex(){

        System.out.println("Input number of index");
        if (scan.hasNextInt()) {
            e = scan.nextInt();
        }
        else {
            System.out.println("Not correct input, please repet");
        }
        System.out.println(arr.toCharArray()[e]);
    };
}
