package ders04_dataCasting;

import java.util.Scanner;

public class C04_DataCasting {
    public static void main(String[] args) {

        // kullanicidan 2 tam sayi alip, bunlari birbirine bolun
        // sonucu double olarak yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bolunecek tamsayiyi girin");
        int a= scan.nextInt();

        System.out.println("Lutfen bolecek tamsayiyi girin");
        int b= scan.nextInt();

        System.out.println("a/b nin degeri : "+a/b); // 15 / 4 = 3,75 ==> 3 yazdirir
        // bolumdeki sayilarin ikisi de int oldugundan Java sonucu da int verecektir

        double sonuc= a/b;
        // java once sag tarafi yapar 15/4=3.75 bulur ama yukardaki kuraldan dolayi 3 yapar
        // double sonuc=3;

        System.out.println("bolumu double'a atama yaparsak : " + sonuc); // 3.0


        double dogruSonuc= (double)a/b ; // 15.0 / 4 = 3.75
        System.out.println("dogru sonuc icin bir sayiyi double'a cast yapinca : " + dogruSonuc);

    }
}
