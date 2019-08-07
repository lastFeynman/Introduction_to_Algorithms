package part1.chapter6.section6_4;

import part1.chapter6.Heap;
import part1.chapter6.section6_2.MaxHeapify;
import part1.chapter6.section6_3.BuildMaxHeap;

public class HeapSort {
    public static void heapSort(Heap heap){
        BuildMaxHeap.buildMaxHeap(heap);
        int[] A = heap.A;
        for(int i=heap.heapSize;i>1;i--){
            int t = A[i-1];
            A[i-1] = A[0];
            A[0] = t;
            heap.heapSize--;
            MaxHeapify.maxHeapify(heap, 1);
        }
    }

    public static void main(String[] args) {
        int[] A = new int[10];
        for(int i=0;i<A.length;i++){
            A[i] = (int)(Math.random()*100);
            System.out.print(A[i]+" ");
        }
        System.out.println();

        Heap heap = new Heap(A, A.length);
        heapSort(heap);

        for (int a : A){
            System.out.print(a+" ");
        }
    }
}
