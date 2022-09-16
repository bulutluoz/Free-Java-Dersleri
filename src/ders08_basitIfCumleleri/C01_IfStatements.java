package ders08_basitIfCumleleri;

import java.util.Scanner;

public class C01_IfStatements {
    public static void main(String[] args) {
        // Soru 1- Kullanicidan bir sayi isteyin,
        // sayiyi kontrol edip 5 ile bolunebiliyorsa “Sayi 5’in tam kati” yazdirin.


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int girilenSayi= scan.nextInt();

        if (girilenSayi % 5 == 0){
            System.out.println("Girilen sayi 5'in tam kati");
        }
    }
}
