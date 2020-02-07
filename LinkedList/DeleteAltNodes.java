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
   
   Node deleteAltNodes(Node head) {
       Node curr = head;
       while(curr!= null && curr.next!=null){
            curr.next = curr.next.next;
            curr= curr.next;
       }
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
        Node newNode = l.deleteAltNodes(l.head);
        l.print(newNode);
        
   }
}
