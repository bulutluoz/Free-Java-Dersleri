package ders10_nestedIfElseStatements;

import java.util.Scanner;

public class C02_NestedIfElseBirinciCozum {
    public static void main(String[] args) {

        /*
          Ornegin : Kullanicidan cinsiyetini ve yasini alin,
          Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
          Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
          veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz");
        String cinsiyet= scan.nextLine();
        System.out.println("Lutfen yasinizi giriniz");
        double yas = scan.nextDouble();

        // once dergiskenlerden birini ana degisken secelim
        // mesela cinsiyet'i secelim ve ona gore ana yapiyi kuralim


        if (cinsiyet.equalsIgnoreCase("Kadin")){
            // kadin bolumu
            if (yas<0 || yas>90){
                System.out.println("yas girisi gecersiz");
            }else if (yas<60){
                System.out.println("Emekli olmak icin "+ (60-yas)+" yil daha calisman gerekir");
            }else {
                System.out.println("emekli olabilirsin");
            }

        } else if (cinsiyet.equalsIgnoreCase("Erkek")) {
            // erkek bolumu

            if (yas<0 || yas>90){
                System.out.println("yas girisi gecersiz");
            }else if (yas<65){
                System.out.println("Emekli olmak icin "+ (65-yas)+" yil daha calisman gerekir");
            }else {
                System.out.println("emekli olabilirsin");
            }
        }else {
            System.out.println("Cinsiyet girisi hatali");
        }
    }
}
