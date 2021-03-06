package Laba2_6;

import java.util.Scanner;

import static java.lang.Math.*;

public class Vector {
    private double[] vector;

    public Vector() {
    }
    public Vector(double[] vector) {
        this.vector = vector;
    }
    public Vector (int size) {

        this.vector = new double[size];
    }
    public double[] getVector() {
        return vector;
    }
    public int getCount() {
        return this.vector.length;
    }
    public double getValue(int index) {
        return this.vector[index];
    }
    public void setValue(int index, double value) {
        this.vector[index] = value;
    }
    public void setVector(double[] vector) {
        this.vector = vector;
    }


    public static Vector sum(Vector v1, Vector v2) {
        Vector result = null;
        if (v1.getCount() == v2.getCount()) {
            int size = v1.getCount();
            double tmpValue;
            result = new Vector(size);
            for (int i = 0; i < size; i++) {
                tmpValue = v1.getValue(i) + v2.getValue(i);
                result.setValue(i,tmpValue);
            }
        }
        return result;
    }

    public static Vector minus(Vector v1, Vector v2) {
        Vector result = null;
        if (v1.getCount()==v2.getCount()) {
            int size = v1.getCount();
            double tmpValue;
            result = new Vector(size);
            for (int i=0; i<size; i++) {
                tmpValue = v1.getValue(i) - v2.getValue(i);
                result.setValue(i,tmpValue);
            }
        }
        return result;
    }

    public static Vector multiply(Vector v1, Vector v2) {
        Vector result = null;
        if (v1.getCount()==v2.getCount()) {
            int size = v1.getCount();
            double tmpValue;
            result = new Vector(size);
            for (int i=0; i<size; i++) {
                tmpValue = v1.getValue(i) * v2.getValue(i);
                result.setValue(i,tmpValue);
            }
        }
        return result;
    }

    public static Vector increment(Vector v1) {
        Vector result = null;
        System.out.print("?????????????? ?????????? ?????? ??????????????????????????????????: ");
        double incr = insertnumber();
        int size = v1.getCount();
        double tmpValue;
        result = new Vector(size);
        for (int i=0; i<size; i++) {
            tmpValue = v1.getValue(i) + incr;
            result.setValue(i,tmpValue);
        }
        System.out.println();
        return result;
    }
    public static double insertnumber() {

        Scanner sc = new Scanner(System.in);
        double kol=0;
        for(;;) {
            if(sc.hasNext()) {
                if(sc.hasNextDouble()) {
                    kol = sc.nextDouble();
                    if(kol>0)break;
                }
                System.out.println("?????????????? ???????????????? ??????????");
                sc.nextLine();
            }
            else { System.out.println("?????????????? ???????????????? ??????????");}
        }
        return kol;
    }
    public static Vector decrement(Vector v1) {
        Vector result = null;
        System.out.print("?????????????? ?????????? ?????? ??????????????????????????????????: ");
        double incr = insertnumber();
        int size = v1.getCount();
        double tmpValue;
        result = new Vector(size);
        for (int i=0; i<size; i++) {
            tmpValue = v1.getValue(i) - incr;
            result.setValue(i,tmpValue);
        }
        System.out.println();
        return result;
    }

    public static double[] createMas(int n) {
        double mas[] = new double[n];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = ((Math.random() * 10) + 1);
        }
        return mas;
    }

    public static void showMas(Vector mas){
        System.out.print(" ????????????: ");
        return_massive(mas);
        System.out.println();
    }

    private static void return_massive(Vector mas) {
        System.out.print("{ ");
        for(int i=0; i<mas.vector.length; i++) {
            System.out.print(mas.vector[i]);
            System.out.print(" ");
        }
        System.out.print("}");
    }
    public static Vector[] create_Mas(int n){
        System.out.println("?????????????? ?????????????????????? ?????????????? ");
        Scanner sc = new Scanner(System.in);
        int k = 0;
        k = sc.nextInt();
        Vector[] vectr = new Vector[k];
        for (int i=0; i < k ; i++ ) {
            double vec[] = new double[n];
            for (int q = 0; q < vec.length; q++) {
                vec[q] = ((Math.random() * 10) + 1);
            }
            vectr[i] = new Vector(vec);
        }
        return vectr;
    }
    public static void show_Mas(Vector[] vectors){
        for(Vector x : vectors)
            Vector.showMas(x);
    }
    public static int scalar_multiply(Vector v1, Vector v2) {
        Vector tmpvector = multiply(v1,v2);
        int result = 0, size = tmpvector.getCount();
        for (int i=0; i<size; i++) {
            result += tmpvector.getValue(i);
        }
        return result;
    }

    public static double length(Vector v1) {
        return sqrt( scalar_multiply(v1,v1));
    }

    public static double angle(Vector v1, Vector v2) {
        double tmpValue;
        tmpValue =  scalar_multiply(v1, v2)/(length(v1) * length(v2));
        tmpValue = (acos(tmpValue));
        return toDegrees(tmpValue);
    }
}
