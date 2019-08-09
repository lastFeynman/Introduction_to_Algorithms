package part2.chapter7.section7_1;

import java.util.Random;

public class RandomPartition {
    public static int randomPartition(int[] A, int p, int r){
        Random random = new Random();
        int i = random.nextInt(r-p+1)+p;
        int t = A[r];
        A[r] = A[i];
        A[i] = t;
        return Partition.partition(A, p, r);
    }
}
