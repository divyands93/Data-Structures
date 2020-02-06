import java.util.*;
public class LinkedList{
    Node head;
    class Node {
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    void insertData(int data ){
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }
    void printMiddle(){
       
      Node fastptr = head;
      Node slowptr = head;
      if(head != null){
          while(fastptr != null && fastptr.next != null){
              fastptr = fastptr.next.next;
              slowptr = slowptr.next;
          }
       
          System.out.println("Middle element is "+ slowptr.data);
      }
      
    }
     public static void main(String []args){
         LinkedList ll = new LinkedList();
         ll.insertData(5);
         ll.insertData(35); 
         ll.insertData(15); 
         ll.insertData(50);
         ll.printMiddle();
     }
}
