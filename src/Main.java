import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //DEĞİŞKENLER

        double mesafe, normalTutar, indirimliTutar, topTutar, yasIndirimi, gdIndirim, indirimliYas = 0;
        double tarife = 0.10;
        int ucusTipi, yas;

        //Girdiler

        Scanner input = new Scanner(System.in);

        System.out.println("Mesafeyi km Türünden Giriniz: ");
        mesafe = input.nextDouble();

        System.out.println("Yaşınızı Giriniz: ");
        yas = input.nextInt();

        System.out.println("Yolculuk Tipini Giriniz( 1=> Tek Yön 2=> Gidiş-Dönüş): ");
        ucusTipi = input.nextInt();

        //Hesaplamalar
        topTutar = mesafe * 0.10;

        if ((yas < 1 || mesafe < 1) || (ucusTipi != 1 && ucusTipi != 2)) {
            System.out.println("Hatalı Veri Girdiniz !");
        }else if (yas<12) {
            if (ucusTipi==2) {
                System.out.println("Toplam tutar: "+ ((topTutar-(topTutar*0.50))-((topTutar-(topTutar*0.50))*0.20)));
            }else{
                System.out.println("Toplam tutar: "+ (topTutar-(topTutar*0.50)));
            }

        }else if (yas<24) {
            if (ucusTipi==2) {
                System.out.println("Toplam tutar: "+ ((topTutar-(topTutar*0.10))-((topTutar-(topTutar*0.10))*0.20)));
            }else{
                System.out.println("Toplam tutar: "+ (topTutar-(topTutar*0.10)));
            }

        }else if (yas>65) {
            if (ucusTipi==2) {
                System.out.println("Toplam tutar: "+ ((topTutar-(topTutar*0.30))-((topTutar-(topTutar*0.30))*0.20)));
            }else{
                System.out.println("Toplam tutar: "+ (topTutar-(topTutar*0.30)));
            }

        }else{
            if (ucusTipi==2) {
                System.out.println("Toplam tutar: "+(topTutar-(topTutar*0.20)));

            }else{
                System.out.println("Toplam tutar: "+ topTutar);
            }
        }
    }
}