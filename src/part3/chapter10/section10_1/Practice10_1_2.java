package part3.chapter10.section10_1;

public class Practice10_1_2 {
    public static void main(String[] args) {
        DoubleEndStack stack = new DoubleEndStack();

        stack.pushLeft(1);
        System.out.println(stack.isLeftEmpty());
    }
}

class DoubleEndStack{
    int[] stack = new int[20];
    int left = -1;
    int right = stack.length;

    public boolean isFull(){
        return left + 1 == right;
    }

    public boolean isLeftEmpty(){
        return left == -1;
    }

    public boolean isRightEmpty(){
        return right == stack.length;
    }

    public boolean pushLeft(int x){
        if(isFull())
            return false;
        stack[++left] = x;
        return true;
    }

    public boolean pushRight(int x){
        if(isFull())
            return false;
        stack[--right] = x;
        return true;
    }

    public int popLeft(){
        if(isLeftEmpty())
            return Integer.MIN_VALUE;
        return stack[left--];
    }

    public int popRight(){
        if(isRightEmpty())
            return Integer.MIN_VALUE;
        return stack[right++];
    }
}