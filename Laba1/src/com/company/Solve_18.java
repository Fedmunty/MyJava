package com.company;

public class Solve_18 {
    private int a ,b ,c, d, e,n = 0;

   public void zadanie() {
       for (int i = 1; i < 99999; i++)  {
           this.a = i;
           while (this.a >= 4)
           {
               if (this.a % 10 == 4 || this.a % 100 == 13)
               {
                   ++n;
                   break;
               }
               this.a /= 10;
            }
           }
       System.out.println(this.n);
       }

}
