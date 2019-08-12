package part3.chapter10.section10_1;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    Stack stack = new Stack();

    @org.junit.jupiter.api.Test
    void isEmpty() {
        System.out.println(stack.isEmpty());
    }

    @org.junit.jupiter.api.Test
    void push() {
        System.out.println(stack.push(1));
        System.out.println(stack.isEmpty());
    }

    @org.junit.jupiter.api.Test
    void pop() {
        System.out.println(stack.push(1));
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
    }
}