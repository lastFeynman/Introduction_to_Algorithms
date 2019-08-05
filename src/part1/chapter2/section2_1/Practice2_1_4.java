package part1.chapter2.section2_1;

public class Practice2_1_4{
    private static int[] add(int[] A, int B[]){
        int[] sum = new int[A.length+1];
        int carry = 0;
        int n;
        for (int i=A.length-1; i>-1;i--){
            n = carry + A[i] + B[i];
            if (n == 0){
                carry = 0;
                sum[i+1] = 0;
            }else if (n == 1){
                carry = 0;
                sum[i+1] = 1;
            }else if (n == 2){
                carry = 1;
                sum[i+1] = 0;
            }else {
                carry = 1;
                sum[i+1] = 1;
            }
        }
        sum[0] = carry;

        return sum;
    }

    public static void main(String[] args) {
        int[] A = new int[8];
        for (int i=0;i<A.length;i++){
            A[i] = (int)Math.round(Math.random());
            System.out.print(A[i]);
        }
        System.out.println();
        int[] B = new int[8];
        for (int i=0;i<B.length;i++){
            B[i] = (int)Math.round(Math.random());
            System.out.print(B[i]);
        }
        System.out.println();
        int[] sum = add(A, B);
        for (int i = 0; i < sum.length; i++) {
            System.out.print(sum[i]);
        }
    }
}
