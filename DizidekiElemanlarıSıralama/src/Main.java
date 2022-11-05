import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizinin boyutu n : ");
        int size=scanner.nextInt();

        int numbers[] = new int[size];

        System.out.println("Dizinin elemanlarını giriniz :");

        for(int i=0; i<size; i++){
            System.out.print((i+1)+". Elemanı : ");
            numbers[i] = scanner.nextInt();
        }

        Arrays.sort(numbers);
        System.out.println("Sıralama"+Arrays.toString(numbers));


    }
}
