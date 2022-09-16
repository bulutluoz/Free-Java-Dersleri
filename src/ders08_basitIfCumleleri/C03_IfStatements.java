package ders08_basitIfCumleleri;

import java.util.Scanner;

public class C03_IfStatements {
    public static void main(String[] args) {

        // Soru 3- Kullanicidan bir sayi alin,
        // sayi 3 ile bolunuyorsa ”Uc ile bolunebilen sayi”,
        // 5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int girilenSayi= scan.nextInt();

        /*
          if cumlesinden sonra { } suslul parantez kullanilirsa
          if sarti saglandiginda { } ici tamamen calistirilir
          sart saglanmazsa { } ici hic calistirilmaz

          Ancak { } kullanilmazsa, java if body'si olarak
          if sartindan sonra ilk ; kadar olan kismi alir
          geriye kalan kodlar if cumlesi ile ilgili olmaz
         */

        if (girilenSayi % 3 == 0 ) {
            System.out.println("uc ile bolunme kontrol sonucu olumlu");
            System.out.println("Uc ile bolunebilen sayi");
        }

        if (girilenSayi % 5 == 0) {
            System.out.println("bes ile bolunme kontrol sonucu olumlu");
            System.out.println("bes ile bolunebilen sayi");
        }
    }
}
