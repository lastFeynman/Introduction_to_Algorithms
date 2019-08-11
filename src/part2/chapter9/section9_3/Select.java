package part2.chapter9.section9_3;

import part1.chapter2.section2_1.InsertionSort;

import java.util.ArrayList;
import java.util.List;

public class Select {
    // every element is different
    public static int select(int[] A, int i){
        int x = findMedian(A);
        List<List<Integer>> partitions = partition(A, x);

        int k = partitions.get(0).size();
        if(k == i)
            return x;
        else if(k > i) {
            int[] lows = new int[k-1];
            for(int j=0;j<k-1;j++){
                lows[j] = partitions.get(0).get(j);
            }
            return select(lows, i);
        }else{
            int[] highs = new int[A.length-k];
            for(int j=0;j<highs.length;j++){
                highs[j] = partitions.get(1).get(j);
            }
            return select(highs, i-k);
        }
    }

    public static List<List<Integer>> partition(int[] A, int x){
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        result.add(new ArrayList<>());

        for(int i=0;i<A.length;i++){
            if(A[i]<=x)
                result.get(0).add(A[i]);
            else
                result.get(1).add(A[i]);
        }
        return result;
    }

    public static int findMedian(int[] A){
        if(A.length<=5){
            InsertionSort.insertionSort(A);
            return A[(A.length-1)/2];
        }

        int remain = A.length % 5;
        int n = A.length / 5;
        int[][] arrays;
        if(remain == 0)
            arrays = new int[n][];
        else
            arrays = new int[n+1][];

        for(int j=0;j<n;j++){
            arrays[j] = new int[5];
            for(int k=0;k<5;k++){
                arrays[j][k] = A[j*5+k];
            }
        }
        if(remain != 0){
            arrays[n] = new int[remain];
            for(int j=0;j<remain;j++){
                arrays[n][j] = A[n*5+j];
            }
        }
        int[] medians = new int[arrays.length];
        for(int j=0;j<medians.length;j++){
            InsertionSort.insertionSort(arrays[j]);
            medians[j] = arrays[j][(arrays[j].length-1)/2];
        }
        return findMedian(medians);
    }

    public static void main(String[] args) {
        int[] A = new int[10];
        for (int i = 0; i < A.length; i++) {
            A[i] = (int) (Math.random() * 100);
            System.out.print(A[i] + " ");
        }
        System.out.println();

        System.out.println(select(A, 3));
    }
}
