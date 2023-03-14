import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişkenleri oluşturun.
        int mat,fizik,kimya,turkce,tarih,muzik;

        //Scanner sınıfımızı tanımladık.
        Scanner input= new Scanner (System.in);

        //Kullanıcıdan değerleri al.
        System.out.print("Matematik Notunuz:");
        mat= input.nextInt();

        System.out.print("Fizik Notunuz:");
        fizik=input.nextInt();

        System.out.print("Kimya Notunuz:");
        kimya=input.nextInt();

        System.out.print("Türkçe Notunuz:");
        turkce=input.nextInt();

        System.out.print("Tarih Notunuz:");
        tarih=input.nextInt();

        System.out.print("Müzik Notunuz:");
        muzik=input.nextInt();

        int toplam=(mat+fizik+kimya+turkce+tarih+muzik);
        double sonuc= toplam/6.0;
        System.out.println("Ortalamanız:"+sonuc);

        boolean kosul=sonuc>=60;
        String str=kosul?"Sınıfı Geçti":"Sınıfta Kaldı";
        System.out.println(str);






    }

}
