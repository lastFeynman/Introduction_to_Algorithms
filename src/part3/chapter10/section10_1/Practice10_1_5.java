package part3.chapter10.section10_1;

public class Practice10_1_5 {
}

class DoubleEndQueue{
    int[] queue = new int[21];
    int head = 0;
    int tail = 0;

    public boolean isEmpty(){
        return head == tail;
    }

    public boolean isFull(){
        return (tail+1)%queue.length == head;
    }

    public boolean enterHead(int x){
        if(isFull())
            return false;
        head = (head-1)%queue.length;
        queue[head] = x;
        return true;
    }

    public boolean enterTail(int x){
        if(isFull())
            return false;
        queue[tail] = x;
        tail = (tail+1)%queue.length;
        return true;
    }

    public int exitHead(){
        if(isEmpty())
            return Integer.MIN_VALUE;
        int x = queue[head];
        head = (head+1)%queue.length;
        return x;
    }

    public int exitTail(){
        if(isEmpty())
            return Integer.MIN_VALUE;
        tail = (tail-1)%queue.length;
        return queue[tail];
    }
}