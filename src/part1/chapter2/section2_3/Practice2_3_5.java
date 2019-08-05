package part1.chapter2.section2_3;

public class Practice2_3_5 {
    private static int search(int[] A, int v){
        int low = 0, high = A.length;
        while(high - low > 1){
            int mid = (low + high) / 2;
            if (A[mid] == v) {
                return mid;
            }else if(A[mid] > v){
                high = mid;
            }else{
                low = mid;
            }
        }
        if(high - low == 1){
            if(A[low] == v)
                return low;
            else if(A[high] == v)
                return high;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] A = new int[10];
        for (int i=0;i<A.length;i++){
            A[i] = (int)(Math.random()*100);
        }
        MergeSort.mergeSort(A, 0, A.length-1);
        for (int a : A) {
            System.out.print(a+" ");
        }
        System.out.println(search(A, 65));
    }
}
