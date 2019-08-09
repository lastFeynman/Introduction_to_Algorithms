package part2.chapter7.section7_1;


public class RandomQuickSort {
    public static void randomQuickSort(int[] A, int p, int r){
        if(p < r){
            int mid = RandomPartition.randomPartition(A, p, r);
            randomQuickSort(A, p, mid-1);
            randomQuickSort(A, mid+1, r);
        }
    }

    public static void main(String[] args) {
        int[] A = new int[10];
        for(int i=0;i<A.length;i++){
            A[i] = (int)(Math.random()*100);
            System.out.print(A[i]+" ");
        }
        System.out.println();

        randomQuickSort(A, 0, A.length-1);

        for (int a : A){
            System.out.print(a+" ");
        }
    }
}
