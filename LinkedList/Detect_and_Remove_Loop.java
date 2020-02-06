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
    void detectLoopandRemove(){
       
      Node fastptr = head;
      Node slowptr = head;
      if(head != null){
          while(fastptr != null && fastptr.next != null && slowptr!= null){
              fastptr = fastptr.next.next;
              slowptr = slowptr.next;
              if(slowptr == fastptr){
                  System.out.println("Loop Detected " + slowptr.data);
                  break;
              }
          }
          if(slowptr == fastptr) {
              slowptr = head;
              while(slowptr.next != fastptr.next){
                   slowptr = slowptr.next;
                   fastptr = fastptr.next;
              }
              System.out.println("Last Elemnent "+ fastptr.data);
              fastptr.next = null;
          }
      }
      
    }
     public static void main(String []args){
         LinkedList ll = new LinkedList();
         ll.insertData(5);
         ll.insertData(35); 
         ll.insertData(15); 
         ll.insertData(50);
         ll.insertData(40);
         ll.insertData(90);
         ll.head.next.next.next.next.next.next = ll.head.next; 
         ll.detectLoopandRemove();
     }
}
