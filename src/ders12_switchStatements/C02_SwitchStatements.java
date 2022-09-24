package ders12_switchStatements;

import java.util.Scanner;

public class C02_SwitchStatements {
    public static void main(String[] args) {
        // Kullanicidan gun numarasini alip, gun ismini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gun numarasini giriniz");
        int gunNo= scan.nextInt();

        switch (gunNo){

            case 1 :
                System.out.println("Pazartesi");
            case 2 :
                System.out.println("Sali");
            case 3 :
                System.out.println("Carsamba");
            case 4 :
                System.out.println("Persembe");
            case 5 :
                System.out.println("Cuma");
        }
    }
}
