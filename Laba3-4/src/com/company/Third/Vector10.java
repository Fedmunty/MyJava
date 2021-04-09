package com.company.Third;

import com.company.Interfaces.Norma;

import java.util.ArrayList;

public class Vector10 implements Norma {
    private int i = 0, sum = 0;

    ArrayList<VectorFor> vector = new ArrayList<VectorFor>();

    public void createVector() {
        System.out.println("Create array [0...10]");
        for (int i = 0; i < 5; i++) {
            vector.add(new VectorFor(i,i+3));
        }
        for(int i = 0; i < vector.size(); i++){
            System.out.println(vector.get(i).getX());
            System.out.println(vector.get(i).getY());

        }
        System.out.println(")________)");
    }

    @Override
    public void norma() {
        for(int i = 0; i < vector.size(); i++) {
            System.out.println(Math.sqrt(Math.abs(vector.get(i).getX()) + Math.abs(vector.get(i).getY())));
        }

    }


}
