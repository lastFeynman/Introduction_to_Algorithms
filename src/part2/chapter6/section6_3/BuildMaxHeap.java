package part2.chapter6.section6_3;

import part2.chapter6.Heap;
import part2.chapter6.section6_2.MaxHeapify;

public class BuildMaxHeap {
    public static void buildMaxHeap(Heap heap){
        for(int i=heap.heapSize/2;i>=1;i--){
            MaxHeapify.maxHeapify(heap, i);
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
        buildMaxHeap(heap);

        for (int a : A){
            System.out.print(a+" ");
        }
    }
}
