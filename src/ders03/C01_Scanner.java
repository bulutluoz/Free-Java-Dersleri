package ders03;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {


        // Kullanicidan ismini alip sonra da yazdiralim

        // 1.adim scanner objesi olustur

        Scanner scan = new Scanner(System.in);

        // 2.adim kullaniciya ne istedigimizi soyleyelim

        System.out.println("Lutfem isminizi giriniz");

        // 3. adim : scan objesini kullanarak, kul;lanicidan bilgiyi alip
        //           olusturacagimiz uygun bir variable'a kaydedelim

        String kullaniciIsmi = scan.nextLine();
        // next() sadece ilk space'e kadar olan metni alirken
        // nextLine() tum satiri alir

        System.out.println("Girilen kullanici ismi : " + kullaniciIsmi);


    }
}
