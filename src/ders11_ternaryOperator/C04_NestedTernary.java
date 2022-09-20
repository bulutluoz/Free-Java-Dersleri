package ders11_ternaryOperator;

import java.util.Scanner;

public class C04_NestedTernary {
    public static void main(String[] args) {
        // Kullanicidan bir tamsayi alin.
        //	Sayi pozitifse, cift sayi veya cift sayi degil seceneklerinden uygun olani yazdirin
        //	Sayi pozitif degilse, 3 basamakli veya 3 basamakli degil seceneklerinden uygun olani yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int a= scan.nextInt();
        /*
        a>0
            ?   a%2==0 ? "cift sayi" : "tek sayi"
            :   a<-100 && a>-1000 ? "3 basamakli" : "3 basamakli degil"

         */

        System.out.println(a>0 ?a%2==0?"cift sayi":"tek sayi":a<-100 && a>-1000?"3 basamakli":"3 basamakli degil");
    }
}
