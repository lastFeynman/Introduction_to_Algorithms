package part1.chapter2.section2_1;

public class Practice2_1_3 {
    private static int search(int[] A, int v){
        for(int i=0;i<A.length;i++){
            if (A[i] == v)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] A = new int[20];
        for (int i=0;i<A.length;i++){
            A[i] = (int)(Math.random()*100);
            System.out.print(A[i]+" ");
        }
        System.out.println();
        System.out.println(search(A, 56));
    }
}
