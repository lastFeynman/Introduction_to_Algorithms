package part2.chapter9.section9_1;

public class MinimumAndMaximum {

    // minmax[0] is minimum, minmax[1] is maximum
    public static int[] minimumAndMaximum(int[] A){
        int[] minmax = new int[2];
        int i;
        if(A.length == 0){
            minmax[0] = Integer.MIN_VALUE;
            minmax[1] = Integer.MAX_VALUE;
            return minmax;
        }
        if(A.length % 2 == 0){
            if(A[0] < A[1]) {
                minmax[0] = A[0];
                minmax[1] = A[1];
            }else{
                minmax[0] = A[1];
                minmax[1] = A[0];
            }
            i = 2;
        }else{
            minmax[0] = minmax[1] = A[0];
            i = 1;
        }
        int max,min;
        while(i<A.length){
            if(A[i] < A[i+1]){
                max = A[i+1];
                min = A[i];
            }else{
                max = A[i];
                min = A[i+1];
            }
            if(minmax[0] > min){
                minmax[0] = min;
            }
            if(minmax[1] < max){
                minmax[1] = max;
            }
            i += 2;
        }
        return minmax;
    }

    public static void main(String[] args) {
        int[] A = new int[10];
        for(int i=0;i<A.length;i++){
            A[i] = (int)(Math.random()*100);
            System.out.print(A[i]+" ");
        }
        System.out.println();

        System.out.println(minimumAndMaximum(A)[0]+" "+minimumAndMaximum(A)[1]);
    }
}
