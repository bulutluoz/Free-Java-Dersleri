package ders09_ifElseStatements;

import java.util.Scanner;

public class C03_IfElseIfStatements {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen notunuzu giriniz");

        double not= scan.nextDouble();

        if (not>100 || not<0){
            System.out.println("Gecersiz not girisi");
        }else if (not>=85){
            System.out.println("AA");
        } else if (not>=65) {
            System.out.println("BB");
        }else if (not>=50){
            System.out.println("CC");
        }else {
            System.out.println("DD");
        }
    }
}
