package part1.chapter6.section6_5;

import part1.chapter6.Heap;
import part1.chapter6.section6_2.MinHeapify;
import part1.chapter6.section6_3.BuildMinHeap;

public class MinPriorityQueue {
    // make sure the parameter heap is a min heap
    public static int minimum(Heap heap){
        return heap.A[0];
    }

    public static int extractMin(Heap heap){
        int[] A = heap.A;
        if(heap.heapSize < 1){
            return Integer.MAX_VALUE;
        }
        int min = A[0];
        A[0] = A[heap.heapSize-1];
        heap.heapSize--;
        MinHeapify.minHeapify(heap, 1);
        return min;
    }

    public static void decreaseKey(Heap heap, int i, int key){
        int[] A = heap.A;
        if(key > A[i-1]){
            return;
        }
        A[i-1] = key;
        while(i>1 && A[heap.parent(i)-1] > A[i-1]){
            int t = A[i-1];
            A[i-1] = A[heap.parent(i)-1];
            A[heap.parent(i)-1] = t;
            i = heap.parent(i);
        }
    }

    public static void insert(Heap heap, int key){
        heap.heapSize++;
        heap.A[heap.heapSize-1] = Integer.MAX_VALUE;
        decreaseKey(heap, heap.heapSize, key);
    }

    public static void delete(Heap heap, int i){
        if(heap.heapSize < 1){
            return;
        }
        int[] A = heap.A;
        if(A[i-1] < A[heap.heapSize-1]){
            A[i-1] = A[heap.heapSize-1];
            MinHeapify.minHeapify(heap, i);
        }else{
            decreaseKey(heap, i, A[heap.heapSize-1]);
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
//        BuildMinHeap.buildMinHeap(heap);
//
//        for(int i=0;i<A.length;i++){
//            System.out.print(extractMin(heap)+" ");
//        }


        int[] A = {1,2,5,6,7,9,10,11,12,13,Integer.MAX_VALUE};
        Heap heap = new Heap(A, A.length-1);
        // decreaseKey(heap, 9, 3);
        insert(heap, 4);
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
    }
}
