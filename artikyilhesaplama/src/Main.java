import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int year;

        System.out.print("Yıl Giriniz : ");
        year = scanner.nextInt();


        if(year%4==0 && year%100!=0){                       //SONU 00 OLMAYAN VE 4 E BÖLÜNEBİLEN YILLAR

            System.out.println(year +" bir artık yıldır !");

        }else if(year%100==0 && year%400==0){              // SONU 00 OLUP 400 E TAM BÖLÜNEN YILLAR

            System.out.println(year +" bir artık yıldır !");

        }else{
            System.out.println(year+" bir artık yıldır değildir !");
        }

    }
}
