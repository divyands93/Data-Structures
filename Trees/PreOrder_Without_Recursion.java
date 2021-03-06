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
     void preOrder() {
         preOrder(root);
     }
     void preOrder(Node root) {
        if(root== null) {
            return;
        }
        Stack<Node> nodeStack = new Stack<Node>();
        nodeStack.push(root);
        while(nodeStack.empty() == false) {
            Node mynode = nodeStack.peek();
            System.out.print(mynode.data+" ");
            nodeStack.pop();
            if(mynode.right!= null){
                nodeStack.push(mynode.right);
            }
             if(mynode.left!= null){
                nodeStack.push(mynode.left);
             }
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
        gt.preOrder();
     }
}
