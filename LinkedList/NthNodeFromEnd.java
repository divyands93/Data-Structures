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
    void printNthNodefromEnd(int n){
      int count =0;
      Node mainptr = head;
      Node refptr = head;
      if(head != null){
          while(count<n){
              if(refptr == null){
                    System.out.println("Greater than number of elements");
              }
               refptr = refptr.next;
               count++;
          }
      }
      while(refptr != null){
          refptr = refptr.next;
          mainptr = mainptr.next;
         
      }
     System.out.println(mainptr.data);
    }
     public static void main(String []args){
         LinkedList ll = new LinkedList();
         ll.insertData(5);
         ll.insertData(35); 
         ll.insertData(15); 
         ll.insertData(50);
         
       ll.printNthNodefromEnd(2);
     }
}
