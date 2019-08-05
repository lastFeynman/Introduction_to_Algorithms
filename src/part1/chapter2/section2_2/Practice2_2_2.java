package part1.chapter2.section2_2;

public class Practice2_2_2 {
    private static void selectionSort(int[] A){
        for (int i = 0; i < A.length-1; i++) {
            int min = A[i], min_index = i;
            for(int j=i+1; j<A.length; j++){
                if (A[j] < min){
                    min = A[j];
                    min_index = j;
                }
            }
            if (min_index != i){
                int t = A[i];
                A[i] = A[min_index];
                A[min_index] = t;
            }
        }
    }

    public static void main(String[] args) {
        int[] A = new int[10];
        for (int i=0;i<A.length;i++){
            A[i] = (int)(Math.random()*100);
        }
        for (int a : A) {
            System.out.print(a+" ");
        }
        System.out.println();
        selectionSort(A);
        for (int a : A) {
            System.out.print(a+" ");
        }
    }
}
