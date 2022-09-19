package ders09_ifElseStatements;

import java.util.Scanner;

public class C02_IfElseStatements {
    public static void main(String[] args) {
        // Soru 2- Kullanicidan notunu alin
        // 50 veya daha buyukse ”Sinifi Gectin”,
        // 50’den kucukse “Maalesef kaldin” yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");
        double not= scan.nextDouble();

        if (not>=50){
            System.out.println("Sinifi gectin");
        }else {
            System.out.println("Maalesef kaldin");
        }
    }
}
