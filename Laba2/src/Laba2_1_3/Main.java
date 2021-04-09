package Laba2_1_3;

public class Main {
    public static void main(String[] args) {
        Abiturient mas[] = Abiturient.createMas(3);
        Abiturient.showMas(mas);
        Abiturient.min_Abiturent(mas);
        Abiturient.average_Abiturent(mas, Abiturient.insert_mark());
    }
}
