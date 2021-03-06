package Laba2_1_2;

import java.util.Scanner;

public class Patient {
    private int id;
    private String surname;
    private  String name;
    private  String otchestvo;
    private  String address;
    private   int phone;
    private  int number_card;
    private  String diagnosis;
    public Patient(){

    }
    public Patient( int id,String surname, String name, String otchestvo,
                    String address, int phone, int number_card, String diagnosis){
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.otchestvo = otchestvo;
        this.address = address;
        this.phone = phone;
        this.number_card = number_card;
        this.diagnosis = diagnosis;
    }
    public void create() {
        System.out.println("введите id");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            id = sc.nextInt();
        }
        System.out.println("введите фамилию ");
        sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            surname = sc.nextLine();
        }
        System.out.println("введите имя ");
        sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            name = sc.nextLine();
        }
        System.out.println("введите отчество ");
        sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            otchestvo = sc.nextLine();
        }
        System.out.println("введите адрес ");
        sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            address = sc.nextLine();
        }
        System.out.println("введите номер телефона ");
        sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            phone = sc.nextInt();
        }
        System.out.println("введите номер медецинской карты ");
        sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            number_card = sc.nextInt();
        }
        System.out.println("введите диагноз ");
        sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            diagnosis = sc.nextLine();
        }
    }
    public void show() {
        System.out.println("id = " + id + ", surname = " + surname + ", name = " + name + ", otchestvo = " + otchestvo + ", address = " + address +
                ", phone =" + phone + ", number_card = " + number_card + ", diagnosis = " + diagnosis);
    }
    public static Patient[] createMas(int n) {
        Patient mas[] = new Patient[n];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = new Patient();
            mas[i].create();
        }
        return mas;
    }
    public static void showMas(Patient[] mas) {
        for (int i = 0; i < mas.length; i++) {
            mas[i].show();
        }
    }
    public  static void nameDiagnosis(Patient[] mas){
        System.out.println("Введите диагноз ");
        Scanner sc = new Scanner(System.in);
        String diagnos = null;
        if(sc.hasNextLine()) {
            diagnos = sc.nextLine();
        }
        for(int i = 0; i < mas.length; i++){
            if(mas[i].diagnosis.equals(diagnos)){
                mas[i].show();
            }
        }
    }
    public static void namePatient(Patient[] mas){
        System.out.println("Введите диапазон чисел ");
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 0;
        if(sc.hasNextInt()) {
            a = sc.nextInt();
            b = sc.nextInt();
        }
        for(int i = 0; i < mas.length; i++){
            if(a <= mas[i].number_card && mas[i].number_card <= b && a < b){
                mas[i].show();
            }
        }
    }
}
