package part2.chapter7.section7_1;

public class Practice7_1_2 {
    public static int partition(int[] A, int p, int r){
        int x = A[r];
        int i = p-1;
        for(int j=p;j<r;j++){
            if(A[j]<x){
                i++;
                int t = A[i];
                A[i] = A[j];
                A[j] = t;
            }else if(A[j] == x && j%2 == p%2){
                i++;
                int t = A[i];
                A[i] = A[j];
                A[j] = t;
            }
        }
        int t = A[i+1];
        A[i+1] = A[r];
        A[r] = t;
        return i+1;
    }

    public static void main(String[] args) {
//        int[] A = new int[10];
//        for(int i=0;i<A.length;i++){
//            A[i] = (int)(Math.random()*100);
//            System.out.print(A[i]+" ");
//        }
//        System.out.println();
        int[] A = {7,7,7,7,7,7};

        System.out.println(partition(A, 0, A.length-1));

        for (int a : A){
            System.out.print(a+" ");
        }
    }
}
