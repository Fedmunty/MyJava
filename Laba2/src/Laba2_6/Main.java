package Laba2_6;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Введите рамерность ветора ");
        Scanner sc = new Scanner(System.in);
        int n = 0;
        n = sc.nextInt();
        Vector v1 = new Vector(Vector.createMas(n));
        Vector v2 = new Vector(Vector.createMas(n));
        System.out.println("Сумма двух векторов " );
        Vector.showMas(v1);
        Vector.showMas(v2);
        Vector.showMas(Vector.sum(v1, v2));

        System.out.println("Разность двух векторов " );
        Vector.showMas(v1);
        Vector.showMas(v2);
        Vector.showMas(Vector.minus(v1, v2));

        System.out.println("Произведение двух векторов " );
        Vector.showMas(v1);
        Vector.showMas(v2);
        Vector.showMas(Vector.multiply(v1, v2));

        System.out.println("Инкроментирование вектора " );
        Vector.showMas(v1);
        Vector.showMas(Vector.increment(v1));

        System.out.println("Дискроментирование вектора " );
        Vector.showMas(v1);
        Vector.showMas(Vector.decrement(v1));

        System.out.println("Скалярное произведение двух векторов " );
        Vector.showMas(v1);
        Vector.showMas(v2);
        System.out.println(Vector.scalar_multiply(v1, v2));

        System.out.println("Угол между двумя векторов " );
        Vector.showMas(v1);
        Vector.showMas(v2);
        System.out.println(Vector.angle(v1, v2));

        Vector mas = new Vector(Vector.createMas(n));
        Vector.show_Mas(Vector.create_Mas(n));
        Vector.showMas(mas);

}
}
