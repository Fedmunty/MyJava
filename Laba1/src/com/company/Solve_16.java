package com.company;
import java.util.Scanner;
public class Solve_16 {
    private int a, c = 0;
    Scanner scanner = new Scanner(System.in);

    public void getSumNumber() {
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()){
            this.a = scanner.nextInt();
            while(this.a!=0){
                this.c=this.c+this.a%10;
                this.a/=10;
            }
            System.out.println("Сумма всех чисел введенного числа равна " + this.c);
        }
        else {
            System.out.println("Вы ввели не число!");
        }
    }
}
