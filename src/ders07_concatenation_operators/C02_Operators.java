package ders07_concatenation_operators;

public class C02_Operators {
    public static void main(String[] args) {

        int a = 20;

        a = a+10; // 30

        /*
        java'da = isareti assignment isaretidir
        Java bu isareti gordugunde once sagdaki deger bulma islemini yapar
        sonra bulunan degeri soldaki variable'a assign eder (atama yapar)
         */

        int b=20;

        // a ile b esit ise ......
        // a ile b esit mi ? sorusu yerine java'da == kullanilir

        System.out.println(a==b); // false

        System.out.println(a == b+10); // 30 == 30 ==> true


       boolean c= 20==b;
        System.out.println(c); // true



    }
}
