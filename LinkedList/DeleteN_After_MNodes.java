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
   
   Node delete_N_After_M_Nodes(Node head, int n,int m) {
       Node curr = head;
       Node nthNode;
       int count =0;
       if(curr == null){
           return null;
       }
       while(count< m-1 && curr!= null){
           curr = curr.next;
           count++;
       }
        nthNode = curr;
        count=0;
        while(curr!=null && count<=n ){
            curr=curr.next;
            count++;
        }
        if(curr!=null) {
           nthNode.next = delete_N_After_M_Nodes(curr,n,m);
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
        Node newNode = l.delete_N_After_M_Nodes(l.head, 1,2);
        l.print(newNode);
        
   }
}
