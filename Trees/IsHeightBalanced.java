import java.util.*;
class Node {
    int data;
    Node right;
    Node left;
    Node(int data){
        this.data = data;
        right = null;
        left = null;
    }
}
public class BST{
    Node root;
    BST(){
        root = null;
    }
    void insert(int data) {
        root = insertUtil(root, data);
    }
    
    Node insertUtil(Node root, int data) {
        if(root==null) {
            root = new Node(data);
        } else {
            if(data>=root.data) {
                root.right = insertUtil(root.right,data);
            } else {
                root.left = insertUtil(root.left,data);
            }
        }
        return root;
    }
    
    void isBalanced() {
       boolean balanced = isBalancedUtil(root);
       System.out.println(balanced);
    }
    
    boolean isBalancedUtil(Node root) {
        if(root == null){
            return true;
        }
        
        return  Math.abs(height(root.left)-height(root.right))< 2 && isBalancedUtil(root.left) && isBalancedUtil(root.right);
    }
    
    int height(Node root) {
        if(root == null) {
            return 0;
        }
        return Math.max(height(root.left), height(root.right))+1;
    }
    
  
     public static void main(String []args){
        BST b= new BST();
        b.insert( 8);
        b.insert( 6);
        b.insert( 4);
        b.insert( 5);
        b.insert( 7);
        b.insert( 2);
        b.insert( 12);
        b.insert( 16);
        b.insert( 18);
        b.insert( 20);
        b.insert( 22);
        b.insert(10);
        b.insert(14);
        b.insert( 11);
        b.isBalanced();
     }
}
