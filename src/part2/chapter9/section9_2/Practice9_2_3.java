package part2.chapter9.section9_2;

import part2.chapter7.section7_1.RandomPartition;

public class Practice9_2_3 {
    public static int randomizedSelectRecurrent(int[] A, int i){
        int p=0, r=A.length-1;
        while(true){
            if(p == r)
                return A[p];

            int q = RandomPartition.randomPartition(A, p, r);
            int k = q - p + 1;
            if(k == i)
                return A[q];
            else if(i < k){
                r = q-1;
            }else{
                p = q+1;
                i = i-k;
            }
        }
    }

    public static void main(String[] args) {
        int[] A = new int[10];
        for (int i = 0; i < A.length; i++) {
            A[i] = (int) (Math.random() * 100);
            System.out.print(A[i] + " ");
        }
        System.out.println();

        System.out.println(randomizedSelectRecurrent(A, 10));
    }
}
