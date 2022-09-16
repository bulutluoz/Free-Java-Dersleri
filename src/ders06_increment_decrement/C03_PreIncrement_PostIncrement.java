package ders06_increment_decrement;

public class C03_PreIncrement_PostIncrement {
    public static void main(String[] args) {

        int sayi= 10;

        sayi++;
        System.out.println(sayi); // 11

        ++sayi;
        System.out.println(sayi); // 12

        System.out.println(sayi++); // bu satirda Java once sayinin eski degerini yazdiracak 12
                                    // sonra sayiyi 1 artiracak sayi=13
        System.out.println(sayi);  // 13


        System.out.println(++sayi); // bu satirda once sayiyi degerini bir artiracak sayi=14
                                    // sayiyi yazdiracak 14

        System.out.println(sayi); // 14

    }
}
