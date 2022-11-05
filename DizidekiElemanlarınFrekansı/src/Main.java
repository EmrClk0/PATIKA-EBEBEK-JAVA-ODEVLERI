import java.util.HashMap;
import java.util.LinkedHashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] numbers={10, 20, 20, 10, 10, 20, 5, 20};
        LinkedHashMap<Integer,Integer> frequence = new LinkedHashMap<>();

        for (int number:numbers) {
            if(frequence.containsKey(number))  // eğer sayı varsa arttır // yoksa kayıt et k 0
                 frequence.replace(number,frequence.get(number)+1);
            else
                frequence.put(number,1);
        }

        for (int key:frequence.keySet()){
            System.out.println(key+" sayısı "+frequence.get(key)+ " kere tekrar edildi.");
        }


    }
}
