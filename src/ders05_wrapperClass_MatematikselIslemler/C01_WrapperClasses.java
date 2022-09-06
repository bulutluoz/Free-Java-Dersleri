package ders05_wrapperClass_MatematikselIslemler;

public class C01_WrapperClasses {
    public static void main(String[] args) {

        String str= "Java";

        System.out.println(str.toUpperCase()); // JAVA


        int sayiP= 20;
        // primitive data turlerinin hazir method'lari yoktur, sadece deger icerirler

        // Wrapper Class'lar primitive data turleri ile ayni degerleri barindirirken
        // degerlerin yaninda hazir method'lar da kullanmiza imkan veren class'lardir

        Integer sayiW=30;

        System.out.println(Integer.MAX_VALUE); // 2147483647
        System.out.println(Integer.MIN_VALUE); // -2147483648

        char karekP='a';
        Character karekW='b';

        System.out.println(Character.isDigit(karekP)); // false
        System.out.println(Character.isLowerCase(karekP)); // true

        String str2="1234";
        String str3="1000";

        System.out.println(str2+str3); // 12341000

        System.out.println(Integer.valueOf(str2) + Integer.valueOf(str3)); // 2234

    }
}
