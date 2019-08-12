package part3.chapter10.section10_1;

public class Stack {
    private int top;
    private int[] stack;

    public Stack(){
        top = 0;
        stack = new int[20];
    }

    public Stack(int length){
        top = 0;
        stack = new int[length];
    }

    public boolean isEmpty(){
        return top == 0;
    }

    public boolean push(int x){
        if(top < stack.length) {
            stack[top] = x;
            top++;
            return true;
        }
        return false;
    }

    public int pop(){
        if(!this.isEmpty()){
            return stack[--top];
        }
        return Integer.MIN_VALUE;
    }
}