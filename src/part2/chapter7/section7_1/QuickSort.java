package part2.chapter7.section7_1;

public class QuickSort {
    public static void quickSort(int[] A, int p, int r){
        if(p < r){
            int mid = Partition.partition(A, p, r);
            quickSort(A, p, mid-1);
            quickSort(A, mid+1, r);
        }
    }

    public static void main(String[] args) {
        int[] A = new int[10];
        for(int i=0;i<A.length;i++){
            A[i] = (int)(Math.random()*100);
            System.out.print(A[i]+" ");
        }
        System.out.println();

        quickSort(A, 0, A.length-1);

        for (int a : A){
            System.out.print(a+" ");
        }
    }
}
