package part3.chapter10.section10_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {
    Queue queue = new Queue();

    @Test
    void isEmpty() {
        System.out.println(queue.isEmpty());
        System.out.println(queue.enqueue(1));
        System.out.println(queue.isEmpty());
    }

    @Test
    void isFull() {
        System.out.println(queue.isFull());
        for(int i=0;i<20;i++)
            queue.enqueue(1);
        System.out.println(queue.isFull());
    }

    @Test
    void enqueue() {
        System.out.println(queue.enqueue(1));
    }

    @Test
    void dequeue() {
        System.out.println(queue.dequeue());
        System.out.println(queue.enqueue(1));
        System.out.println(queue.dequeue());
    }
}