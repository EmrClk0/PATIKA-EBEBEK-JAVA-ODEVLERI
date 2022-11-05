import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	    double height, weight, indexOfBodyMass;
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        height = scanner.nextDouble();                   //kullanıcıdan metre cinsinden boy alma


        System.out.print("Lütfen kilonuzu giriniz : ");
        weight = scanner.nextDouble();                  //kullanıcıdan kilogram cinsinde ağırlık alma

        indexOfBodyMass = weight/(Math.pow(height,2)); //Vucut Kitle İndexi hesaplama
        System.out.println("Vücut Kitle İndeksiniz : "+ indexOfBodyMass);




    }
}
