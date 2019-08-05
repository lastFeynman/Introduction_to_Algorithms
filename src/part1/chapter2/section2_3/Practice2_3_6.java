package part1.chapter2.section2_3;

public class Practice2_3_6 {
    static void enhancedInsertionSort(int A[]){
        for (int i=1;i<A.length;i++){
            int num = A[i];
            int index = search(A, num, i);
            for (int j=i-1;j>=index;j--){
                A[j+1] = A[j];
            }
            A[index] = num;
        }
    }

    private static int search(int[] A, int v, int i){
        int low = 0, high = i-1;
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
            if(A[low] >= v)
                return low;
            else if (A[high] > v)
                return high;
            else
                return high+1;
        }
        if (high == low){
            if(A[low] > v)
                return low;
            else
                return high + 1;
        }
        return -1;
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
        enhancedInsertionSort(A);
        for (int a : A) {
            System.out.print(a+" ");
        }
    }
}
