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
     void postOrder() {
         postOrder(root);
     }
     void postOrder(Node root) {
        Stack<Node> s1 = new Stack<Node>();
        Stack<Node> s2 = new Stack<Node>();
        Node curr = root;
        s1.push(curr);
        while(s1.empty()== false) {
            Node s = s1.pop();
            s2.push(s);
            if(s.left != null){
                s1.push(s.left);
            }
            if(s.right != null){
                s1.push(s.right);
            }
        }
        while(s2.empty() == false){
            System.out.print(s2.pop().data + " ");
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
        gt.postOrder();
     }
}
