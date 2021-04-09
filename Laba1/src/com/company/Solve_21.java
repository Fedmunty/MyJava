package com.company;

public class Solve_21 {
    private int randNumb;

    public void petrovFunc() {
        this.randNumb = (int)(Math.random()*28800);
        System.out.println(this.randNumb);
        if (this.randNumb > 25200 && this.randNumb < 28800) {
            System.out.println("8 hour");
        }
        else if (this.randNumb > 21600 && this.randNumb <25200) {
            System.out.println("7 hour");
        }
        else if (this.randNumb > 18000 && this.randNumb < 21600) {
            System.out.println("6 hour");
        }
        else if (this.randNumb > 14400 && this.randNumb < 18000) {
            System.out.println("5 hour");
        }
        else if (this.randNumb > 10800 && this.randNumb < 14400) {
            System.out.println("4 hour");
        }
        else if (this.randNumb > 7200 && this.randNumb < 10800) {
            System.out.println("3 hour");
        }
        else if (this.randNumb > 3600 && this.randNumb < 7200) {
            System.out.println("2 hour");
        }
        else if (this.randNumb > 0 && this.randNumb < 3600) {
            System.out.println("Menshe chasa");
        }
    }

}
