package ders04_dataCasting;

import java.util.Scanner;

public class C03_DataCastingChar {
    public static void main(String[] args) {

        int a= 'a'+'b';
        System.out.println(a); // 97+98=195

        System.out.println('a' + 'b'); // 195

        System.out.println(""+'a'+'b'); //ab

        // kullanicidan bir char alin
        // ascii tablosunda bu karakterden sonraki 3 karakteri yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char girilenKarakter= scan.next().charAt(0);

        System.out.println("Girilen karakter : " + girilenKarakter);

        System.out.println("girilen karakterin bir sonrasi : " + (char)(girilenKarakter+1));
        System.out.println("girilen karakterin iki sonrasi : " + (char)(girilenKarakter+2));
        System.out.println("girilen karakterin uc sonrasi : " + (char)(girilenKarakter+3));
    }
}
