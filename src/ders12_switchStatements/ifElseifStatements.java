package ders12_switchStatements;

import java.util.Scanner;

public class ifElseifStatements {
    public static void main(String[] args) {
        // kullanicidan gun numarasini alip, gun ismini yazdiralim

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gun numarasini giriniz");
        int gunNo= scan.nextInt();

        if (gunNo==1) {
            System.out.println("Pazartesi");
        }else if (gunNo==2) {
            System.out.println("Sali");
        }else if (gunNo==3) {
            System.out.println("Carsamba");
        }else if (gunNo==4) {
            System.out.println("Persembe");
        }else if (gunNo==5) {
            System.out.println("Cuma");
        }else if (gunNo==6) {
            System.out.println("Cumartesi");
        }else if (gunNo==7) {
            System.out.println("Pazar");
        }else{
            System.out.println("gecersiz gun numarasi");
        }
    }
}
