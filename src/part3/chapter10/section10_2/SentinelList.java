package part3.chapter10.section10_2;

public class SentinelList {
    private static Node NIL = new Node(0);
    public SentinelList(){
        NIL.next = NIL;
        NIL.prev = NIL;
    }

    public Node search(int x){
        Node p = NIL.next;
        while(p != NIL && p.value != x){
            p = p.next;
        }
        return p;
    }

    public void insertAtHead(int x){
        Node node = new Node(x);
        node.next = NIL.next;
        node.prev = NIL.prev;
        NIL.next.prev = node;
        NIL.next = node;
    }

    public void delete(Node node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
}
