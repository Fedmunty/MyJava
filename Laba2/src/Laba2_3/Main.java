package Laba2_3;

public class Main {
    public static void main(String[] args) {
        Sklad mas[] = Sklad.createMas(1);
        Sklad.showMas(mas);
        Sklad._newKol_Product(mas);
        Sklad._newPrice(mas);
        Sklad.price_all_product(mas);
        Sklad.compare_price(mas, Sklad.price_all_product(mas));
//        Sklad sklad = new Sklad();
//        sklad.create();
        //sklad.show();
    }
}
