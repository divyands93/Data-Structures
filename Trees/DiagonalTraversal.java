import java.util.*;
import java.util.Map.Entry;
class Node {
         int data;
         Node left;
         Node right;
         Node(int num){
             data = num;
             right = null;
             left = null;
         }
         
}
public class Tree{
    Node root;
    Tree(){
        root = null;
    }
    
    void insertNum(int num) {
         root = insert(root, num);
    }
    Node insert(Node root, int num) {
         if(root == null) {
             root = new Node(num);
            
         } else if(root.data < num){
            root.right = insert(root.right, num);
         } else{
            root.left =  insert(root.left, num);
         }
          return root;
    }
     void diagonalTraversal() {
        HashMap<Integer, LinkedList<Integer>> hm = new HashMap<Integer, LinkedList<Integer>>();
            diagonalTraversal(root,0,hm);
            for(Entry<Integer, LinkedList<Integer>> entry : hm.entrySet()){
                System.out.println(entry.getValue());
            }
            
     }
     void diagonalTraversal(Node root, int d, HashMap<Integer, LinkedList<Integer>> hm) {
        if(root== null){
             return;
        }
        LinkedList node = hm.get(d);
        if(node == null){
            node = new LinkedList<>();
        }
        node.add(root.data);
        hm.put(d, node);
        diagonalTraversal(root.left, d+1, hm);
        diagonalTraversal(root.right, d, hm);
     }
     public static void main(String []args){
        Tree gt = new Tree();
        gt.insertNum(8);
        gt.insertNum(6);
        gt.insertNum(4);
        gt.insertNum(5);
        gt.insertNum(7);
        gt.insertNum(2);
        gt.insertNum(12);
        gt.insertNum(10);
        gt.insertNum(14);
        gt.insertNum( 11);
        gt.diagonalTraversal();
     }
}
