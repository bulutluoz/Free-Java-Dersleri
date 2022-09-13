package ders06_increment_decrement;

public class C02_PreIncrement_PostIncrement {
    public static void main(String[] args) {

        int sayi=10;

        // sayi degerini olusturacagimiz b variable'ina atayalim
        // ve sonra sayi degerini 1 artiralim

        int b = sayi;
        sayi++;


        System.out.println(b); // 10
        System.out.println(sayi); // 11

        // bunu tek satirda yapabilir miyiz ?
        // sayi degerini olusturacagimiz c variable'ina atayalim
        // ve sonra sayi degerini 1 artiralim

        sayi=11;
        int c= sayi++;
        System.out.println(c); // 11
        System.out.println(sayi); // 12


        sayi=11;
        c= ++sayi;
        System.out.println(c); // 12
        System.out.println(sayi); // 12

    }
}
