import java.util.*;
public class LinkedList {
   Node head;
   class Node {
       int data;
       Node next;
       Node(int data){
           this.data= data;
           next= null;
       }
   } 
   
   void addNode(int data){
       Node newNode = new Node(data);
       newNode.next  = head;
       head = newNode;
   }
   
   Node removeEveryKthNode(Node head, int k) {
       Node curr = head;
       int count =1;
       while(curr != null && count<k-1) {
           curr = curr.next;
           count++;
       }
       if(curr!= null && curr.next!=null)
            curr.next = removeEveryKthNode(curr.next.next, k);
       return head;
       
   }
   void print(Node head) {
        Node curr = head;
        while(curr!= null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
   public static void main(String[] args){
       LinkedList l = new LinkedList();
        l.addNode(40);
        l.addNode(20);
        l.addNode(60);
        l.addNode(10);
        l.addNode(50);
        l.addNode(70);
        l.addNode(30);
        l.addNode(90);
        l.print(l.head);
        System.out.println();
        Node newNode = l.removeEveryKthNode(l.head, 3);
        l.print(newNode);
   }
}
