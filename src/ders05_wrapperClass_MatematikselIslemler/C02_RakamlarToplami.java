package ders05_wrapperClass_MatematikselIslemler;

import java.util.Scanner;

public class C02_RakamlarToplami {
    public static void main(String[] args) {
        // Kullanicidan alinan 3 basamakli pozitif bir tamsayinin
        // rakamlar toplamini bulun

        System.out.println( 23 / 5 ); // 4,6 ==> 4

        System.out.println( 123 % 10); // 3
        System.out.println(123 / 10); // 12.3 ==> 12

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen 3 basamakli pozitif bir tamsayi giriniz");
        int sayi= scan.nextInt(); // 123

        int birlerBas=0;
        int rakamlarToplami=0;

        // 3 basamak icin ayni islemi 3 kere yapmamiz gerekir
        // girilen sayinin birler basamagindaki 3 icin
        birlerBas=sayi%10; // 3
        rakamlarToplami=rakamlarToplami+birlerBas; // 3
        sayi= sayi / 10 ; // 12

        // girilen sayinin onlar basamagindaki 2 icin

        birlerBas=sayi%10; // 12 % 10  ==> 2
        rakamlarToplami=rakamlarToplami+birlerBas; // 3 + 2 = 5
        sayi=sayi/10; // 12/10 =1.2 ==>1

        // girilen sayinin yuzler basamagindaki 1 icin

        birlerBas=sayi%10; // 1 % 10 =1
        rakamlarToplami=rakamlarToplami+birlerBas; // 5 + 1 = 6
        sayi=sayi/10; // 1 / 10 =0.1 ==> 0


        System.out.println("Sayinin rakamlar toplami : " + rakamlarToplami);

    }
}
