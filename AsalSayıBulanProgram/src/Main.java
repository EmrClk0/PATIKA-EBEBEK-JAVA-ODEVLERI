import java.util.Scanner;

public class Main {

    public static boolean isPrime(int number, int dividing){
        if(dividing<number){
            if(number%dividing==0)
                return false;
            else
                dividing++;
                return isPrime(number,dividing);
        }
        return true;
    }

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        int number = scanner.nextInt();

        if(isPrime(number,2)){
            System.out.println(number+" sayısı ASALDIR !");
        }else{
            System.out.println(number+" sayısı ASAL değildir !");
        }


    }
}
