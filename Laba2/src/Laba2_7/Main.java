package Laba2_7;

public class Main {
    public static void main(String args[]) {
        Mnozhestvo mn1 = new Mnozhestvo(Mnozhestvo.insertmnozhestvo(Mnozhestvo.insertRazmmnozhestvo()));
        Mnozhestvo mn2 = new Mnozhestvo(Mnozhestvo.insertmnozhestvo(Mnozhestvo.insertRazmmnozhestvo()));
        System.out.println("Объединение (сумма) {"+mn1.toString()+"} + {"+mn2.toString()+"} =  "+Mnozhestvo.objed(mn1,mn2).toString());
        System.out.println("Пересечение (умножение) {"+mn1.toString()+"} * {"+mn2.toString()+"} =  "+Mnozhestvo.peres(mn1,mn2).toString());
        System.out.println("Разность (вычитание) {"+mn1.toString()+"} / {"+mn2.toString()+"} =  "+Mnozhestvo.raznost(mn1,mn2).toString());
        System.out.println("Присваивание 1 {"+mn1.toString()+"} := {"+mn2.toString()+"} =  "+Mnozhestvo.prisv1(mn1,mn2).toString());
        System.out.println("Множество из двух разностей множества {"+mn1.toString()+"} и {"+mn2.toString()+"} =  "+Mnozhestvo.twoobjbuild(mn1, mn2).toString());
        System.out.println("Присваивание 2 {"+mn1.toString()+"} := "+Mnozhestvo.prisv2(mn1).toString());
        Mnozhestvo.find(mn1);
        //создание массива объектов
        int i=0;
        int n=Mnozhestvo.insertNumMn();
        Mnozhestvo[] mn = new Mnozhestvo[n];
        for(;;){
            System.out.println("Введите информацию о множестве "+(i+1));
            String[] mnozhestvo=Mnozhestvo.insertmnozhestvo(Mnozhestvo.insertRazmmnozhestvo());
            mn[i] = new Mnozhestvo(mnozhestvo);
            if(i>=n-1)break;
            i++;
        }
        //вывод списка векторов в массиве объектов
        for(Mnozhestvo v : mn){
            v.show();
        }
        //метод обнаружения элемента во множестве
        Mnozhestvo.showAllParams(mn);
        //построение множества из двух разностей
        for (int j=0; j<mn.length; j=j+2) {
            System.out.println("\"Множество из двух разностей множеств {"+mn[j].toString()+"} и {"+mn[j+1].toString()+"} =  "+(Mnozhestvo.twoobjbuild(mn[j], mn[j+1])).toString()+"} ");
        }
    }
}