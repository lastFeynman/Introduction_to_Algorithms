package part3.chapter10.section10_1;

public class Queue {
    private int head;
    private int tail;
    private int[] queue;

    public Queue(){
        head = 0;
        tail = 0;
        queue = new int[21];
    }

    public boolean isEmpty(){
        return head == tail;
    }

    public boolean isFull(){
        return (tail+1)%queue.length == head;
    }

    public boolean enqueue(int x){
        if(this.isFull())
            return false;
        queue[tail] = x;
        tail = (tail+1) % queue.length;
        return true;
    }

    public int dequeue(){
        if(this.isEmpty())
            return Integer.MIN_VALUE;
        int x = queue[head];
        head = (head+1)%queue.length;
        return x;
    }
}
