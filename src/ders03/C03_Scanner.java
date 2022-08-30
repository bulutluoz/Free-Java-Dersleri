package ders03;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {

        // Kullanicidan  bir kelime isteyip
        // kelimenin ilk harfini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        char ilkHarf=scan.next().charAt(0);

        /*
         Java'da String icerisindeki karakterler index ile tutulur
         ornegin kullanici Ali yazarsa
         0.index: A , 1.index : l, 2.index : i

         scanner class'inda scan.nextChar() yoktur
         bunun yerine scan.next() kullanip
         kullanicinin girdigi ilk kelimeyi alir,
         sonra charAt(0) kullanarak 0.index'deki
         kelimenin ilk harfini aliriz
         */

        System.out.println("Girilen kelimenin ilk harfi : " + ilkHarf);
    }
}
