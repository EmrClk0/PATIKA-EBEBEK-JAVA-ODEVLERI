public class Main {


    public static void main(String[] args) {

        boolean isNumPrime=true;

        for(int x=2; x<=100; x++){           // 0 100 arası sayılar x e atanır

            for(int y=2; y<x; y++){          // y değişkeni 2 ile sayı arasında değerleri sıra sıra alır

                if(x%y==0){                  // sayı kendisinden küçük y değişkenine tam bölünüyorsa sayı asal değildir;
                    isNumPrime=false;
                    break;
                }

            }
            if(isNumPrime){
                System.out.print(x+" ");
            }
            isNumPrime=true;
        }



    }
}
