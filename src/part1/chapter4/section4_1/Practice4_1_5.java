package part1.chapter4.section4_1;

public class Practice4_1_5 {
    private static int[] findMaxSubarray(int[] A){
        int[] result = new int[3];
        int localMax = A[0];
        result[2] = A[0];

        int low = 0, high = 0;
        for(int i=1;i<A.length;i++){
            localMax += A[i];
            if(localMax <= A[i]){
                localMax = A[i];
                low = i;
                high = i;
            }else{
                high++;
            }

            if(localMax > result[2]){
                result[2] = localMax;
                result[0] = low;
                result[1] = high;
            }
        }


        return result;
    }

    public static void main(String[] args) {
        int[] A = {13, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12, -5, -22, 15, -4, 7};
        // int[] A = {-13, -3, -25, -20, -3, -16, -23, -18, -20, -7, -12, -5, -22, -15, -4, -7};
        int[] result = findMaxSubarray(A);
        System.out.println(result[0]);
        System.out.println(result[1]);
        System.out.println(result[2]);
    }
}
