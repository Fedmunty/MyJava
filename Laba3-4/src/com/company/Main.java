package com.company;

import com.company.Fourth.*;
import com.company.First.*;
import com.company.Second.*;
import com.company.Third.*;
import com.company.Interfaces.*;

public class Main {

    public static void main(String[] args) throws SizeMismatchExceprion {
        Matrix matrix = new Matrix(4);
          matrix.create();
         System.out.println(matrix.sum());
         System.out.println(matrix.сompare());
         matrix.getValueOfIndex();
         matrix.setRandValue();
         matrix.showValue();
         matrix.scale();
         matrix.showValue();

         Char1 str = new Char1();
        str.create();
        str.showValue();
        str.getValueOfIndex();

        Vector1 vec1 = new Vector1() {};
        Vector1 vec2 = new Vector1() {};
        vec1.create();
        vec2.create();
        vec1.showValue();
        vec2.showValue();
        System.out.println(vec1.сompareVec(vec1.sum(),vec2.sum()));

        Square arr[] = new Square[4];
        arr[0] = new Circle();
        arr[1] = new Rectangle();
        arr[2] = new Trapeci();
        arr[3] = new Triangle();
        for (int i = 0; i < 4; i++) {
            System.out.println(arr[i].square());
        }


        Vector10 vec = new Vector10();
        vec.createVector();
        vec.norma();

        StudentNight stud = new StudentNight();
        stud.printF();
        MainEngiiner mainEngiiner = new MainEngiiner();
        mainEngiiner.somethingDoing();
        Theate theate = new Theate();
        theate.buildTeaht();
        theate.priceGet();
        Aircraft air = new Aircraft();
        air.swimming();
        air.shooting();
        VideoPlayeer player = new VideoPlayeer();
        player.on();
        player.off();
        player.play();
        WeightCraft weiCragt = new WeightCraft();
        weiCragt.moove();

        /*Доработайте первое задание к главе 3. Создайте свое исключение
            SizeMismatchExceprion(несовпадение размеров) и обработайте его.*/

    }
}
