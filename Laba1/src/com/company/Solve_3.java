package com.company;
import java.util.Scanner;

public class Solve_3 {
    Scanner scanner = new Scanner(System.in);
    private int a,b,x,y;

    public void getRes() {
        System.out.println("Input a");
        this.a = scanner.nextInt();
        System.out.println("Input b");
        this.b = scanner.nextInt();
        if (this.a != this.b) {
            if (this.a < this.b){
                this.x = (this.a + this.b) / 2;
                this.y = this.a * this.b * 2;
            }
            else {
                this.y = (this.a + this.b) / 2;
                this.x = this.a * this.b * 2;
            }
        }
        else {
            System.out.println("Nepravilno vvelu");
        }
        System.out.println("Menshee" + this.x);
        System.out.println("Bolshee" + this.y);


    }
}
