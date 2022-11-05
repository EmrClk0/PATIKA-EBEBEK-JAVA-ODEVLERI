import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //GEREKLİ DEĞİŞKENLER
        double totalPrice=0.0, armutPrice=2.14, elmaPrice=3.67, domatesPrice=1.11, muzPrice=0.95, patlicanPrice= 5.00, kilo;

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Armut Kaç Kilo ? :");
        kilo = scanner.nextDouble();
        totalPrice += kilo*armutPrice;

        System.out.print("Elma Kaç Kilo ? :");
        kilo = scanner.nextDouble();
        totalPrice += kilo*elmaPrice;

        System.out.print("Domates Kaç Kilo ? :");
        kilo = scanner.nextDouble();
        totalPrice += kilo*domatesPrice;

        System.out.print("Muz Kaç Kilo ? :");
        kilo = scanner.nextDouble();
        totalPrice += kilo*muzPrice;

        System.out.print("Patlıcan Kaç Kilo ? :");
        kilo = scanner.nextDouble();
        totalPrice += kilo*patlicanPrice;

        System.out.println("Toplam Tutar : " + totalPrice+" TL");

    }
}
