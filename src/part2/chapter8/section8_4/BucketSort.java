package part2.chapter8.section8_4;

public class BucketSort {
    public static void bucketSort(int[] A){
        Node[] lists = new Node[10];
        for(int i=0;i<10;i++){
            lists[i] = new Node(-1);
        }

        for(int i=0;i<A.length;i++){
            int t = A[i]/10;
            int remain = t%10;
            insert(lists[remain], A[i]);
        }
        int j = 0;
        for(int i=0;i<10;i++){
            Node p = lists[i].next;
            while(p!=null){
                A[j] = p.val;
                j++;
                p = p.next;
            }
        }
    }
    public static void insert(Node list, int val){
        Node p = list.next;
        Node pre = list;
        while(p != null &&p.val<val && p.next != null){
            pre = p;
            p = p.next;
        }
        if(p != null && p.val>=val){
            Node node = new Node(val);
            pre.next = node;
            node.next = p;
        }else if(p == null){
            pre.next = new Node(val);
        }else{
            p.next = new Node(val);
        }
    }

    public static void main(String[] args) {
        int[] A = new int[10];
        for(int i=0;i<A.length;i++){
            A[i] = (int)(Math.random()*100);
            System.out.print(A[i]+" ");
        }
        System.out.println();
        bucketSort(A);
        for (int a : A){
            System.out.print(a+" ");
        }
    }
}

class Node{
    int val;
    Node next;
    public Node(int val){
        this.val = val;
        next = null;
    }
}