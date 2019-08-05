package part1.chapter2.section2_1;

public class Practice2_1_2 {
    private static void insertionSort(int[] A){
        for (int i=1;i<A.length;i++){
            int num = A[i];
            int j = i-1;
            for(;j>=0;j--){
                if(num > A[j]){
                    A[j+1] = A[j];
                }else {
                    break;
                }
            }
            A[j+1] = num;
        }
    }

    public static void main(String[] args) {
        int[] A = new int[10];
        for (int i=0;i<A.length;i++){
            A[i] = (int)(Math.random()*100);
            System.out.print(A[i]+" ");
        }
        System.out.println();
        insertionSort(A);
        for (int a : A) {
            System.out.print(a+" ");
        }
    }
}
