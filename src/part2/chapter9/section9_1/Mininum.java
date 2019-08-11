package part2.chapter9.section9_1;

public class Mininum {
    public static int minimum(int[] A){
        if(A.length == 0)
            return Integer.MIN_VALUE;
        int min = A[0];
        for(int i=1;i<A.length;i++){
            if(A[i] < min)
                min = A[i];
        }
        return min;
    }
}
