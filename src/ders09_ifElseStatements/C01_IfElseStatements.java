package ders09_ifElseStatements;

import java.util.Scanner;

public class C01_IfElseStatements {
    public static void main(String[] args) {
        // Soru 1- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        // ucgen eskenar ise “Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ucgenin 3 kenarini tam sayi olarak girin" +
                "\nHer kenar uzunlugundan sonra enter'a basin");

        int kenar1= scan.nextInt();
        int kenar2= scan.nextInt();
        int kenar3= scan.nextInt();

        if (kenar1==kenar2 && kenar2==kenar3){
            System.out.println("Girilen kenarlar bir eskenar ucgen olusturur");
        }else {
            System.out.println("Girilen kenarlar bir eskanar olusturmaz");
        }
    }
}
