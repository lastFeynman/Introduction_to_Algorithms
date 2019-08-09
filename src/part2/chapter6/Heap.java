package part2.chapter6;

public class Heap {
    public int[] A = new int[0];
    public int heapSize = 0;

    public Heap(int[] A, int heapSize){
        this.A = A;
        this.heapSize = heapSize;
    }

    public int right(int i){
        return 2 * i + 1;
    }

    public int left(int i){
        return 2 * i;
    }

    public int parent(int i){
        return i / 2;
    }
}
