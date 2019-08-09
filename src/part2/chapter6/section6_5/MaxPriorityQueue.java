package part2.chapter6.section6_5;

import part2.chapter6.Heap;
import part2.chapter6.section6_2.MaxHeapify;

public class MaxPriorityQueue {
    // make sure the parameter heap is a max heap
    public static int maximum(Heap heap){
        return heap.A[0];
    }

    public static int extractMax(Heap heap){
        int[] A = heap.A;
        if(heap.heapSize < 1){
            return Integer.MIN_VALUE;
        }
        int max = A[0];
        A[0] = A[heap.heapSize-1];
        heap.heapSize--;
        MaxHeapify.maxHeapify(heap, 1);
        return max;
    }

    public static void increaseKey(Heap heap, int i, int key){
        int[] A = heap.A;
        if(key < A[i-1]){
            return;
        }
        A[i-1] = key;
        while(i>1 && A[heap.parent(i)-1] < A[i-1]){
            int t = A[i-1];
            A[i-1] = A[heap.parent(i)-1];
            A[heap.parent(i)-1] = t;
            i = heap.parent(i);
        }
    }

    public static void insert(Heap heap, int key){
        heap.heapSize++;
        heap.A[heap.heapSize-1] = Integer.MIN_VALUE;
        increaseKey(heap, heap.heapSize, key);
    }

    public static void delete(Heap heap, int i){
        if(heap.heapSize < 1){
            return;
        }
        int[] A = heap.A;
        if(A[i-1] > A[heap.heapSize-1]){
            A[i-1] = A[heap.heapSize-1];
            MaxHeapify.maxHeapify(heap, i);
        }else{
            increaseKey(heap, i, A[heap.heapSize-1]);
        }
        heap.heapSize--;
    }

    public static void main(String[] args) {
//        int[] A = new int[10];
//        for(int i=0;i<A.length;i++){
//            A[i] = (int)(Math.random()*100);
//            System.out.print(A[i]+" ");
//        }
//        System.out.println();
//
//        Heap heap = new Heap(A, A.length);
//        BuildMaxHeap.buildMaxHeap(heap);
//
//        for(int i=0;i<A.length;i++){
//            System.out.print(extractMax(heap)+" ");
//        }


        int[] A = {16,14,10,8,7,9,3,2,4,1,Integer.MIN_VALUE};
        Heap heap = new Heap(A, A.length-1);
//        increaseKey(heap, 9, 15);
        insert(heap, 13);
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
    }
}
