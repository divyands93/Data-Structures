import java.util.*;
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
     void levelOrder() {
         levelOrder(root);
     }
     void levelOrder(Node root) {
        if(root== null){
             return;
        }
        Queue<Node> s1 = new LinkedList<>();
        Node curr = root;
        s1.add(curr);
        while(true) {
            int nodeCount = s1.size();
            if(nodeCount == 0) {
                break;
            }
            while(nodeCount>0) {
                Node s = s1.remove();
                System.out.print(s.data + " ");
                if(s.left != null){
                    s1.add(s.left);
                }
                if(s.right != null){
                    s1.add(s.right);
                }
                nodeCount--;
            }
             System.out.println();
        }
     }
     public static void main(String []args){
         Tree gt = new Tree();
        gt.insertNum( 8);
        gt.insertNum( 6);
        gt.insertNum( 4);
        gt.insertNum( 5);
        gt.insertNum( 7);
        gt.insertNum( 2);
        gt.insertNum( 12);
        gt.insertNum(10);
        gt.insertNum(14);
        gt.insertNum( 11);
        gt.levelOrder();
     }
}
