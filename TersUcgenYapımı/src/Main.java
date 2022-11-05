import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Basamak Sayısı : ");
        int basamak = scanner.nextInt();


        for (int i=1; i<=basamak; i++){
            // i bosluk atla basamak*2-2*i kadar yazdır
            for (int free=0; free<i;free++){
                System.out.print(" ");
            }
            for(int start=0; start<=(basamak*2-2*i);start++){
                System.out.print("*");
            }
            System.out.println("");
        }


    }
}
