package Laba2_1_2;



public class Main {
    public static void main(String[] args) {
        Patient mas[] = Patient.createMas(3);
        Patient.showMas(mas);
        System.out.println("Пациенты с таким диагназом ");
        Patient.nameDiagnosis(mas);
        Patient.namePatient(mas);
    }
}