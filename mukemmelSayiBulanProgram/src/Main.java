import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int number = scanner.nextInt();
        int sumDivisors=0;

        for (int divisor = number-1; divisor>0; divisor--){

                if(number%divisor==0){
                    sumDivisors = sumDivisors +divisor;
                }

        }

        if(sumDivisors==number)
            System.out.println(number+" Mükemmel sayıdır");
        else
            System.out.println(number+" Mükemmel sayı değildir");


    }
}
