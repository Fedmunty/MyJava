package Laba2_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Fraction dr1 = new Fraction();
        Fraction dr2 = new Fraction();
        dr1.create();
        dr2.create();
        Fraction.sum(dr1, dr2);
        Fraction.minus(dr1, dr2);
        Fraction.multiply(dr1, dr2);
        Fraction.dilive(dr1, dr2);
        int i=0;
        //создание массива объектов
        int n = Fraction.insertNumDrobi();
        Fraction[] dr = new Fraction[n];
        for(;;){
            System.out.println("Введите дробь № "+(i+1));
            int chisl = Fraction.insertM();
            int znam = Fraction.insertN();
            dr[i] = new Fraction(chisl,znam);
            if(i>=n-1)break;
            i++;
    }

        for(Fraction x : dr){
            x.show();
        }

        Fraction.Izmenenie(dr);
        for(Fraction x : dr){
            x.show();
        }
    }
}
