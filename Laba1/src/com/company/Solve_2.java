package com.company;
import javax.swing.*;
import java.util.Scanner;

public class Solve_2 {
    Scanner scanner = new Scanner(System.in);
    private int a, b, c, d, num;

    public void oneFun() {
        System.out.println("Input your four-digit number : ");
        if (scanner.hasNextInt()) {
            this.num = scanner.nextInt();
        }

        System.out.println(this.num);
        this.a = this.num / 1000;
        this.b = this.num / 100 % 10;
        this.c = this.num % 100 / 10;
        this.d = this.num % 1000 % 10;

        if ((this.a + this.b) == (this.c + this.d)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public void twoFun() {
        System.out.println("Input your three-digit number : ");
        if (scanner.hasNextInt()) {
            this.num = scanner.nextInt();
        }
        System.out.println(this.num);
        this.a = this.num / 100;
        this.b = this.num % 100 / 10;
        this.c = this.num % 10;

        if ((this.a + this.b + this.c) % 2 == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public void threeFunc() {
        System.out.println("Input your two-digit number :");
        if (scanner.hasNextInt()) {
            this.num = scanner.nextInt();
        }

        this.a = this.num / 10;
        this.b = this.num % 10;

        if (this.num % 2 == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public void fourFunc() {
        System.out.println("Input a(Katet) ,b(Katet) ,c(Gipotenuza)");
        if (scanner.hasNextInt()) {
            this.a = scanner.nextInt();
            this.b = scanner.nextInt();
            this.c = scanner.nextInt();
        }

        this.a = (int) Math.pow(this.a, 2);
        this.b = (int) Math.pow(this.b, 2);
        this.c = (int) Math.pow(this.c, 2);

        if ((a + b) == c) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public void fiveFunc() {
        System.out.println("Input four-digit razlichnoe chislo");
        if (scanner.hasNextInt()) {
            this.num = scanner.nextInt();
        }

        System.out.println(this.num);
        this.a = this.num / 1000;
        this.b = this.num / 100 % 10;
        this.c = this.num % 100 / 10;
        this.d = this.num % 1000 % 10;

        if(this.a != this.b && this.a != this.b && this.a != this.c && this.a != this.d){
            if(this.b != this.c && this.b != this.d){
                if(this.c != this.d){
                    System.out.println("true");
                }else{
                    System.out.println("false");
                }
            }else{
                System.out.println("false");
            }
        }else{
            System.out.println("false");
        }

    }
    public void sixFunc() {
        System.out.println("input number");
        if (scanner.hasNextInt()) {
            this.num = scanner.nextInt();
        }

        this.a = this.num / 1000;
        this.b = this.num /100 % 10;
        this.c = this.num % 100 /10;
        this.d = this.num % 100 % 10;

        if (a == d && b == c) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
        scanner.close();
    }

}
