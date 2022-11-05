public class Main {

    public static int[][] TransposeOfArray(int[][] array){              // transpoze alan fonksiyon

        int[][] transpose = new int[array[0].length][array.length];

        for (int x=0; x<array.length; x++){
            for (int y=0; y<array[x].length; y++){
                transpose[y][x] = array[x][y];
            }
        }
        return transpose;
    }



    public static void Print2DArray(int[][] array){                 // 2 Boyutlu arrayi konsola yazdıran fonksiyon

        for (int[] colum:array){
            for (int num: colum){
                System.out.print(num+" ");
            }
            System.out.println("");
        }
    }


    public static void main(String[] args) {

        int[][] array = {{2,3,4},{5,6,4}};
        System.out.println("Matris : ");
        Print2DArray(array);


        int[][] transposeArray = TransposeOfArray(array);
        System.out.println("Transpoze : ");
        Print2DArray(transposeArray);


        array = new  int[][]{{1,2,3},{4,5,6}};
        System.out.println("Matris : ");
        Print2DArray(array);


        transposeArray = TransposeOfArray(array);
        System.out.println("Transpoze : ");
        Print2DArray(transposeArray);



    }
}
