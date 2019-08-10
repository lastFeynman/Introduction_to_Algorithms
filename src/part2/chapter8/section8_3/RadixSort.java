package part2.chapter8.section8_3;

public class RadixSort {
    public static void radixSort(int[][] numbers, int d){
        for(int i=d-1;i>=0;i--){
            sortWith(numbers, i);
        }
    }
    public static void sortWith(int[][] numbers, int d){
        for(int i=0;i<numbers.length-1;i++){
            for(int j=0;j<numbers.length-i-1;j++){
                if(numbers[j][d] > numbers[j+1][d]){
                    int[] t = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = t;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] numbers = {{3,2,9},
                           {4,5,7},
                           {6,5,7},
                           {8,3,9},
                           {4,3,6},
                           {7,2,0},
                           {7,5,5}};
        radixSort(numbers, 3);
        System.out.println();
    }
}
