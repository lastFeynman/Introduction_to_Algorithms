package part1.chapter6.section6_2;

import part1.chapter6.Heap;

public class MinHeapify {
    public static void minHeapify(Heap heap, int i){
        int[] A = heap.A;

        int l = heap.left(i);
        int r = heap.right(i);
        int smallest = i;
        if(l<=heap.heapSize && A[l-1] < A[i-1]){
            smallest = l;
        }
        if(r<=heap.heapSize && A[r-1] < A[smallest-1]){
            smallest = r;
        }
        if(smallest != i) {
            int t = A[smallest-1];
            A[smallest-1] = A[i-1];
            A[i-1] = t;
            minHeapify(heap, smallest);
        }
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 8, 5, 6, 7, 4, 9};
        Heap heap = new Heap(A, A.length);
        minHeapify(heap, 4);
        for (int a : A) {
            System.out.print(a+" ");
        }
    }
}
