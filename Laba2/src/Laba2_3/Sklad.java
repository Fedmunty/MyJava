package Laba2_3;

import java.util.Scanner;

public class Sklad {
    private int kol_product;
    private int price_of_one;
    private int old_price;
    public Sklad() {

    }

    public Sklad(int kol_product, int price_of_one) {
        this.kol_product = kol_product;
        this.price_of_one = price_of_one;
        this.old_price = price_of_one * kol_product;
    }

//    public static int insertProduct() {
//        System.out.println("Введите количесвто товаров ");
//        Scanner sc = new Scanner(System.in);
//        int kol_product = sc.nextInt();
//        return kol_product;
//    }
//
//    public static int insertPrice() {
//        System.out.println("Введите стоимость товара ");
//        Scanner sc = new Scanner(System.in);
//        int price_of_one = sc.nextInt();
//        return price_of_one;
//    }

    public void create() {
        System.out.println("Введите количесвто товаров ");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt())
            kol_product = sc.nextInt();
        System.out.println("Введите стоимость товара ");
        if (sc.hasNextInt())
            price_of_one = sc.nextInt();
    }

    public void show() {
        System.out.println("kol_product = " + kol_product + ", price_of_one = " + price_of_one);
    }

    public static Sklad[] createMas(int n) {
        Sklad mas[] = new Sklad[n];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = new Sklad();
            mas[i].create();
        }
        return mas;
    }

    public static void showMas(Sklad[] mas) {
        for (int i = 0; i < mas.length; i++) {
            mas[i].show();
        }
    }

    public static int _newKol_Product(Sklad[] mas) {
        System.out.println("Введите новое количество товара ");
        int new_kol_product = 0;
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            new_kol_product = sc.nextInt();
        }
        for (int i = mas.length - 1; i >= 0; i--) {
            mas[i].kol_product = new_kol_product;
            mas[i].show();
        }
        return new_kol_product;
    }
    public static void _newPrice(Sklad[] mas) {
        System.out.println("Введите новую цену товара ");
        int new_price_of_one = 0;
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            new_price_of_one = sc.nextInt();
        }
        for (int i = mas.length - 1; i >= 0; i--) {
            mas[i].price_of_one = new_price_of_one;
            mas[i].show();
        }
    }
    public static int price_all_product(Sklad[] mas){
        System.out.println("Общая стоимось товара ");
        int price_all_product = 0;
        for(int i = 0; i < mas.length; i++){
            price_all_product = mas[i].kol_product * mas[i].price_of_one;
        }
        System.out.println(price_all_product);
        return price_all_product;
    }
    public static void compare_price(Sklad[]mas, int price_all){
for(int i = 0; i < mas.length; i++){
    if(price_all < mas[i].old_price){
        System.out.println("Стоимость упала ");
    }
    else {
        System.out.println("Стоимость возрасла ");
    }
}
    }
public static void general_kol_product(Sklad[] mas,int kol_prod){
        kol_prod = _newKol_Product(mas) ;
}

}




//    Разработать класс Склад. Два поля: количество единиц товара и
//        стоимость 1 единицы. Конструктор пустой и конструктор с двумя
//        параметрами. Написать метод позволяющий изменять количество товара.
//        Написать метод позволяющий изменять стоимость товара. Написать метод
//        позволяющий рассчитывать стоимость товара. Написать метод для
//        сравнения стоимости товаров. Написать метод с переменным числом
//        параметров определяющий общее количество товаров