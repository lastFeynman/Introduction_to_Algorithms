package part1.chapter4.section4_1;

public class Practice4_1_2 {
    private static int[] findMaxSubarray(int[] A){
        int[] result = new int[3];
        result[2] = Integer.MIN_VALUE;
        for(int i=0;i<A.length;i++){
            int sum = 0;
            for(int j=i;j<A.length;j++){
                sum += A[j];
                if(sum > result[2]){
                    result[2] = sum;
                    result[0] = i;
                    result[1] = j;
                }
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
