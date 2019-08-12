package part3.chapter10.section10_2;

public class Practice10_2_7 {


}

class SingleList{
    Node head;
    SingleList(){
        head = null;
    }

    public void reversal(){
        Node p1 = null;
        Node p2 = head;
        Node p3;
        while(p2 != null){
            p3 = p2.next;
            p2.next = p1;
            p1 = p2;
            p2 = p3;
        }
        head = p1;
    }
}

class SingleNode{
    int value;
    Node next;
    SingleNode(int value){
        this.value = value;
        next = null;
    }
}