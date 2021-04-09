package Laba2_1_1;

import java.util.Scanner;

public class Student {
    private int id;
    private String surname;
    private String name;
    private String otchectvo;
    private String data;
    private String address;
    private int phone;
    private String faculty;
    private int cour;
    private int group;


    public Student() {

    }


    public Student(int id, String surname, String name, String otchectvo, String data, String address, int phone, String faculty, int cour, int group) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.otchectvo = otchectvo;
        this.data = data;
        this.address = address;
        this.phone = phone;
        this.faculty = faculty;
        this.cour = cour;
        this.group = group;
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
            otchectvo = sc.nextLine();
        }
        System.out.println("введите дату рождения ");
        sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            data = sc.nextLine();
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
        System.out.println("введите факультет ");
        sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            faculty = sc.nextLine();
        }
        System.out.println("введите курс ");
        sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            cour = sc.nextInt();
        }
        System.out.println("введите номер группы ");
        sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            group = sc.nextInt();
        }
    }

    public void show() {
        System.out.println("id =" + id + ", surname=" + surname + ", name = " + name+ ", otchectvo =" + otchectvo + ", data=" + data + ", address = " + address+
                ", phone=" + phone + ", faculty = " + faculty + ", cour =" + cour + ", group = " + group);
    }
    public void show1(){
        System.out.println( "surname=" + surname + ", name = " + name + ", otchectvo =" + otchectvo);
    }

    public static Student[] createMas(int n) {
        Student mas[] = new Student[n];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = new Student();
            mas[i].create();
        }
        return mas;
    }
    public static void showMas(Student[] mas) {
        for (int i = 0; i < mas.length; i++) {
            mas[i].show();
        }
    }
    public static void nameStudent(Student[] mas) {
        System.out.println("Введите название факультета ");
        Scanner sc = new Scanner(System.in);
        String find_name = null;
        if(sc.hasNextLine()) {
            find_name = sc.nextLine();
        }
        for (int i = 0; i < mas.length; i++) {
            if (mas[i].name.equals(find_name)) {
                mas[i].show();
            }
        }
    }
    public  static void nameGroup(Student[] mas){
        System.out.println("Введите номер группы ");
        Scanner sc = new Scanner(System.in);
        int number_group = 0;
        if(sc.hasNextInt()) {
            number_group = sc.nextInt();
        }
        for(int i = 0; i < mas.length; i++){
            if(mas[i].group == number_group){
                mas[i].show1();
            }
        }
    }
    public  static void nameFaculty_Cour(Student[] mas){
        System.out.println("Введите факультет ");
        Scanner sc = new Scanner(System.in);
        String name_faculty = null;
        int number_cour = 0;
        if(sc.hasNextLine()){
            name_faculty = sc.nextLine();
        }
        System.out.println("Введите курс ");
        if(sc.hasNextInt()){
            number_cour = sc.nextInt();
        }
        for(int i = 0; i < mas.length; i++){
            if(mas[i].faculty.equals(name_faculty) && mas[i].cour == number_cour){
               mas[i].show();
            }
        }
    }
    public static void nameData(Student[]mas){
        System.out.println("Введите год рождения ");
        Scanner sc = new Scanner(System.in);
        String year_data = null;
        if(sc.hasNextLine()){
            year_data = sc.nextLine();
        }
        for(int i = 0; i < mas.length; i++){
            if(mas[i].data.equals(year_data)){
            }
            else  {
                mas[i].show();
            }
        }

    }
}



