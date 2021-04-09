package Laba2_8;

class Main {
    public static void main(String[] args) {
        Uravnenie ur1 = new Uravnenie(Uravnenie.inserta(), Uravnenie.insertb(), Uravnenie.insertc());
        Uravnenie.showintervals(ur1);
        Uravnenie.showrootext(ur1);
        Uravnenie.showur(ur1);
        int i=0;
        //создание массива объектов
        int n=Uravnenie.insertNumUr();
        Uravnenie[] ur = new Uravnenie[n];
        for(;;){
            System.out.println("Введите данные уравнения № "+(i+1));
            double a=Uravnenie.inserta();
            double b=Uravnenie.insertb();
            double c=Uravnenie.insertc();
            ur[i] = new Uravnenie(a,b,c);
            if(i>=n-1)break;
            i++;
        }
        //вывод списка уравнений
        for(Uravnenie x : ur){
            Uravnenie.showur(x);
            Uravnenie.showrootext(x);
            Uravnenie.showintervals(x);

        }
        //max min корень
        Uravnenie.maxRoot(ur);
        Uravnenie.minRoot(ur);
    }
}