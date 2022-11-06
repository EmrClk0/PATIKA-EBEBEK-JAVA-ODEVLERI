import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int distance, age, tripType;
        double feePerDistance=0.1, ticketPrice, discount;

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Mesafeyi km türünden giriniz : ");
        distance = scanner.nextInt();

        System.out.print("Yaşınızı giriniz : ");
        age = scanner.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        tripType = scanner.nextInt();


        if(distance < 0 || age < 0 || !(tripType==1 ||tripType==2)){

            System.out.println("Hatalı Veri Girdiniz !");

        }else{

            ticketPrice = (double)distance*feePerDistance;

            if(age<12){

                discount = ((double) 50/100)*ticketPrice;          //bilet fiyatına %50 indirim yansıtımı
                ticketPrice -= discount;

            }else if(12<=age && age<=24){

                discount = ((double) 10/100)*ticketPrice;          //bilet fiyatına %10 indirim yansıtımı
                ticketPrice -= discount;

            }else if(age>65){         // AGE>65

                discount = ((double) 30/100)*ticketPrice;          //bilet fiyatına %30 indirim yansıtımı
                ticketPrice -= discount;
            }


            if(tripType==2){

                discount = ((double) 20/100)*ticketPrice;          //bilet fiyatına %20 indirim yansıtımı
                ticketPrice -= discount;
                ticketPrice *= 2;                                  // gidiş dönüş oldugu için indirimlerden sonra 2 ile çarpıldı

            }

            System.out.println("Toplam Tutar = "+ticketPrice+" TL");



        }


    }
}
