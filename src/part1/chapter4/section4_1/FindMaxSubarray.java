package part1.chapter4.section4_1;

public class FindMaxSubarray {
    private static int[] findMaxSubarray(int[] A, int low, int high){
        int[] result = new int[3];
        if (low == high){
            result[0] = low;
            result[1] = high;
            result[2] = A[low];
            return result;
        }

        int mid = (low + high) / 2;
        int[] leftResult = findMaxSubarray(A, low, mid);
        int[] rightResult = findMaxSubarray(A, mid+1, high);
        int[] crossResult = FindMaxCrossingSubarray.findMaxCrossingSubarray(A, low, mid, high);

        if(leftResult[2] >= rightResult[2] && leftResult[2] >= crossResult[2])
            return leftResult;
        else if(rightResult[2] >= crossResult[2])
            return rightResult;
        else
            return crossResult;
    }

    public static void main(String[] args) {
        // int[] A = {13, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12, -5, -22, 15, -4, 7};
        int[] A = {-13, -3, -25, -20, -3, -16, -23, -18, -20, -7, -12, -5, -22, -15, -4, -7};
        int low = 0, high = A.length-1;
        int[] result = findMaxSubarray(A, low, high);
        System.out.println(result[0]);
        System.out.println(result[1]);
        System.out.println(result[2]);
    }
}
