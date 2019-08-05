package part1.chapter4.section4_1;

public class FindMaxCrossingSubarray {
    public static int[] findMaxCrossingSubarray(int[] A, int low, int mid, int high){
        int[] result = new int[3];
        int sum = 0;

        int left_sum = Integer.MIN_VALUE;
        for(int i=mid;i>=low;i--){
            sum += A[i];
            if (sum > left_sum){
                left_sum = sum;
                result[0] = i;
            }
        }

        sum = 0;
        int right_sum = mid==high?0:Integer.MIN_VALUE;
        for(int i=mid+1;i<=high;i++){
            sum += A[i];
            if (sum > right_sum){
                right_sum = sum;
                result[1] = i;
            }
        }

        result[2] = left_sum + right_sum;
        return result;
    }

    public static void main(String[] args) {
        // int[] A = {13, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12, -5, -22, 15, -4, 7};
        int[] A = {13};
        int low = 0, high = A.length-1;
        int mid = (low + high) / 2;
        int[] result = findMaxCrossingSubarray(A, low, mid, high);
        System.out.println(result[0]);
        System.out.println(result[1]);
        System.out.println(result[2]);
    }
}
