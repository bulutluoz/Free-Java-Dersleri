package ders03;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

        /*
          Kullanicidan ismini, soyismini ve yasini alip
          ismin ilk harfi soyisim , yas seklinde yazdirin

         */


        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz");

        String isim=scan.nextLine();

        System.out.println("Lutfen soyisminizi giriniz");

        String soyisim= scan.nextLine();

        System.out.println("Lutfen yasinizi giriniz");

        int yas=scan.nextInt();

        System.out.println("Girilen bilgiler: " + isim.charAt(0) + " "
                            +soyisim +", " + yas);
    }
}
