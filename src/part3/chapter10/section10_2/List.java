package part3.chapter10.section10_2;

import java.util.LinkedList;

public class List {
    private Node head;

    public List() {
        head = null;
    }

    public Node search(int x) {
        Node p = head;
        while (p != null && p.value != x) {
            p = p.next;
        }
        return p;
    }

    public void insertAtHead(int x) {
        Node node = new Node(x);
        node.next = head;
        if (head != null)
            head.prev = node;
        head = node;
    }

    // this node may not be in the list
//    public void deleteByNode(Node node){
//        if(node == null)
//            return;
//
//        Node p = head;
//        while(p!=null && p!=node){
//            p = p.next;
//        }
//        if(p == null){
//            if(p.prev != null)
//                p.prev.next = p.next;
//            if(p.next != null)
//                p.next.prev = p.prev;
//        }
//    }

    // this node must be in the list
    public void deleteByNode(Node node) {
        if (node == null)
            return;
        if (node.prev != null)
            node.prev.next = node.next;
        if (node.next != null)
            node.next.prev = node.prev;
    }

    public void deleteByValue(int x) {
        Node node = search(x);
        deleteByNode(node);
    }


}

class Node {
    Node prev;
    Node next;
    int value;

    public Node(int value) {
        prev = null;
        next = null;
        this.value = value;
    }
}
