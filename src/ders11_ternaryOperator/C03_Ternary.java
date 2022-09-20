package ders11_ternaryOperator;

import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {
        // Soru 4- Kullanicidan notunu alin
        // 50 veya daha buyukse ”Sinifi Gectin”,
        // 50’den kucukse “Maalesef kaldin” yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");
        double not= scan.nextDouble();

        System.out.println(not>=50 ? "Sinifi gectin" : "Maalesef kaldin");
    }
}
