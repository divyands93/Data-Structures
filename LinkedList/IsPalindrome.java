import java.util.*;
public class LinkedList{
    Node head;
     Node mainptr;
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
    boolean isPalindrome(Node refptr ) {
      mainptr = head;
      if(refptr == null){
         return true;
      }
      boolean isp = isPalindrome(refptr.next);
      if(isp == false){
          return false;
      }
      
      boolean ispl = (refptr.data == mainptr.data);
      mainptr= mainptr.next;
      return ispl;
      
    }
     public static void main(String []args){
         LinkedList ll = new LinkedList();
         ll.insertData(0);
         ll.insertData(2); 
         ll.insertData(0); 
         ll.insertData(2);
         ll.insertData(2);
         ll.insertData(0);
         ll.insertData(2);
         ll.insertData(0);
         boolean x = ll.isPalindrome(ll.head);
         System.out.println(x);
     }
}
