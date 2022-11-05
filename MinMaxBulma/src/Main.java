import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public  static int minElemenet(int[] array){

        int min=array[0];

        for (int i=0; i< array.length; i++){
            if(array[i]<min)
                min=array[i];
        }
        return min;
    }


    public static int maxElement(int[] array){

        int max=array[0];
        for (int num: array){
            if(num>max)
                max=num;
        }
        return max;
    }




    public static void main(String[] args) {

        int arraySize;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz: ");
        arraySize = scanner.nextInt();

        int[] numbers = new int[arraySize];


        for(int i=0; i<arraySize; i++){

            System.out.print((i+1)+". Sayıyı giriniz: ");
            numbers[i] = scanner.nextInt();

        }

        /*
        Arrays.sort(numbers);                                            // .sort ile dizi küçükten büyüğe sıralanır
        System.out.println("En büyük sayı: "+numbers[arraySize-1]);     // son eleman en büyük olur
        System.out.println("En küçük sayı: "+numbers[0]);              // dolayısıyla ilk eleman en küçük
        */

        System.out.println("En büyük sayı: "+maxElement(numbers));
        System.out.println("En küçük sayı: "+minElemenet(numbers));



    }
}
