import java.util.Scanner;

public class Main {

    public static int CalculateExponentialNum(int base, int power){
        int result=1;
        if(power>0){
            result = base * CalculateExponentialNum(base,power-1);
        }
        return result;
    }



    public static void main(String[] args) {
	    int base, power;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Taban değeri giriniz : ");
        base = scanner.nextInt();

        System.out.print("Üs değerini giriniz : ");
        power = scanner.nextInt();

        System.out.println("Sonuç "+CalculateExponentialNum(base,power));
    }
}
