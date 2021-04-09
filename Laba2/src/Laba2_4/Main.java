package Laba2_4;

public class Main {
    public static void main(String[] args) {
        Book mas[]=Book.createMas(3);
        Book.showMas(mas);
        Book find = Book.nameBook(mas);
        System.out.println("Информация о книге ");
        find.show();
        Book.insertAuthor(Book.insertAuthor());
        Book.insertName(Book.insertName());
        Book.insertYear(Book.insertYear());
        Book.insertPage(Book.insertPage());



    }
}
