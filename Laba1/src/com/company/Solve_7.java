package com.company;
import java.util.Scanner;

public class Solve_7 {
    private int a ,password;
    Scanner scanner = new Scanner(System.in);

    public int getRandom() {
        this.password = (int) + (Math.random() * 10);
        return this.password;
    }

    public int getRes() {
        this.a = scanner.nextInt();
        if (this.a == this.password) {
            System.out.println("Vse verno");
        } else {
            if (this.a < this.password) {
                System.out.println("Vi vveli chislo menshe");
            }
            else {
                System.out.println("Vi vveli chislo bolshe");
            }
            System.out.println("Ne verno, Vvedite eshe raz");
            return getRes();
        }
        System.out.println("Password is :" + this.password);
        System.out.println("Vash vvod : " + this.a);
        return this.a;

    }

}
