import java.util.*;
public class LinkedList {
    Node head;
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    LinkedList() {
        head = null;
    }

    void addNode(int num) {
       
        Node newNode = new Node(num);
        newNode.next = head;
        head = newNode;
    }
    
    Node getMiddle(Node head) {
        if(head == null) {
            return head;
        }
        Node slowptr = head, fastptr = head;
        while(fastptr.next != null && fastptr.next.next != null) {
            fastptr = fastptr.next.next;
            slowptr= slowptr.next;
        }
        return slowptr;
    }
    Node sortedMerge(Node left, Node right){
        Node result = null;
        if(left == null) {
            return right;
        } 
        if(right == null) {
            return left;
        }
        if(left.data <= right.data) {
            result = left;
            result.next = sortedMerge(left.next, right);
        } else {
             result = right;
            result.next = sortedMerge(left, right.next);
        }
        return result;
    }
    Node mergeSortInLinkedList(Node head){
        if(head == null || head.next == null) {
            return head;
        }
        Node middle = getMiddle(head);
        Node nextToMiddle = middle.next;
        middle.next = null;
        Node left = mergeSortInLinkedList(head);
        Node right = mergeSortInLinkedList(nextToMiddle);
        Node sortedList = sortedMerge(left, right);
        return sortedList;
    }
    
    void print(Node head) {
        Node curr = head;
        while(curr!= null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.addNode(40);
        l.addNode(20);
        l.addNode(60);
        l.addNode(10);
        l.addNode(50);
        l.addNode(30);
        l.head = l.mergeSortInLinkedList(l.head);
        l.print(l.head);
    }
}
