package Laba2_2;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setKor_x();
        circle.setKor_y();
        circle.setRadius();
        circle.ShowParamentr();
        System.out.println("Площадь круга " + circle.squareCircle());
        System.out.println("Длина круга " + circle.lengthCircle());
        circle.plus_X();
        circle.plus_Y();
        circle.plus_R();
        circle.ShowParamentr();
        System.out.println("Площадь круга " + circle.squareCircle());
        System.out.println("Длина круга " + circle.lengthCircle());
    }
}
