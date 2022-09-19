package ders10_nestedIfElseStatements;

import java.util.Scanner;

public class C03_NestedIfElseIkinciCozum {
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
        // mesela yas'i secelim ve ona gore ana yapiyi kuralim

        if (yas<0 || yas>90){
            System.out.println("Yas girisi gecersiz");
        }else if(yas<60){
            // 60 yasdan kucuk bolumu
            if (cinsiyet.equalsIgnoreCase("Kadin")){
                System.out.println("Emekli olmak icin "+ (60-yas)+" yil daha calisman gerekir");
            } else if (cinsiyet.equalsIgnoreCase("Erkek")) {
                System.out.println("Emekli olmak icin "+ (65-yas)+" yil daha calisman gerekir");
            }else{
                System.out.println("cinsiyet girisi gecersiz");
            }

        } else if (yas<65) {
            // 60 - 65 arasi
            if (cinsiyet.equalsIgnoreCase("Kadin")){
                System.out.println("Emekli olabilir");
            } else if (cinsiyet.equalsIgnoreCase("Erkek")) {
                System.out.println("Emekli olmak icin "+ (65-yas)+" yil daha calisman gerekir");
            }else{
                System.out.println("cinsiyet girisi gecersiz");
            }
        }else {
            // 65-90 arasi
            if (cinsiyet.equalsIgnoreCase("Kadin")){
                System.out.println("Emekli olabilir");
            } else if (cinsiyet.equalsIgnoreCase("Erkek")) {
                System.out.println("Emekli olabilir");
            }else{
                System.out.println("cinsiyet girisi gecersiz");
            }
        }
    }
}
