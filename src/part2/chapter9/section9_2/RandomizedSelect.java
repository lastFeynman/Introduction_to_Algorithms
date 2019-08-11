package part2.chapter9.section9_2;

import part2.chapter7.section7_1.RandomPartition;

public class RandomizedSelect {
    public static int randomizedSelect(int[] A, int p, int r, int i) {
        if(p == r)
            return A[p];
        int q = RandomPartition.randomPartition(A, p, r);
        int k = q-p+1;
        if(k == i)
            return A[q];
        else if(i < k){
            return randomizedSelect(A, p, q-1, i);
        }else{
            return randomizedSelect(A, q+1, r, i-k);
        }
    }


    public static void main(String[] args) {
        int[] A = new int[10];
        for (int i = 0; i < A.length; i++) {
            A[i] = (int) (Math.random() * 100);
            System.out.print(A[i] + " ");
        }
        System.out.println();

        System.out.println(randomizedSelect(A, 0, A.length - 1, 10));
    }

}
