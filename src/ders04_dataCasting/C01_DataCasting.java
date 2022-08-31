package ders04_dataCasting;

public class C01_DataCasting {

    public static void main(String[] args) {
        int a=134;
        double b=23.4;
        short c= 34;
        byte d= 14;


        double e = a;  // degerin data turu int, variable'in data turu degerin data turunden daha genis
        int f=c; // degerin data turu < variable'in data turu

        short g=d; // short > byte otomatik olarak cevirir auto widening


        short h = (short)b; // variable data turu short < b'nin data turu double
        System.out.println("double 23,4'un short karsiligi : " + h); // 23


        byte l=(byte)a; // variable data turu byte < a'nin data turu int
        System.out.println("int 134'un byte karsiligi : " + l); // -122

        int m=(int)b; // variable'in data turu int < b'nin data turu double
        System.out.println("double 23.4'un int karsiligi : " + m); // 23

    /* biz daha kapsamli data turundeki bir degeri, daha dar kapsamli bir variable'a atamak istersek
     java bunu otomatik yapmayacaktir.
     Cunku daha kapsamliyi, daha dar kapsamli bir ture cevirmek istiyorsunuz
     data kayiplari olabilir veya java datayi yeni data turune cevirmek icin degistirebilir

     */
    }
}
