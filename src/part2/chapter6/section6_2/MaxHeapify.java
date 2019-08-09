package part2.chapter6.section6_2;

import part2.chapter6.Heap;

public class MaxHeapify {
    public static void maxHeapify(Heap heap, int i){
        int[] A = heap.A;

        int l = heap.left(i);
        int r = heap.right(i);
        int largest = i;
        if(l<=heap.heapSize && A[l-1] > A[i-1]){
            largest = l;
        }
        if(r<=heap.heapSize && A[r-1] > A[largest-1]){
            largest = r;
        }
        if(largest != i) {
            int t = A[largest-1];
            A[largest-1] = A[i-1];
            A[i-1] = t;
            maxHeapify(heap, largest);
        }
    }

    public static void main(String[] args) {
        int[] A = {16, 4, 10, 14, 7, 9, 3, 2, 8, 1};
        Heap heap = new Heap(A, A.length);
        maxHeapify(heap, 2);
        for (int a : A) {
            System.out.print(a+" ");
        }
    }
}
