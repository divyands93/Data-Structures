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
     void printSpiral() {
         int ht = height(root);
         boolean flag= false;
         for(int i=1; i<=ht; i++) {
             printGivenLevel(root,i,flag);
             System.out.println();
             flag = !flag;
         }
     }
     void printGivenLevel(Node root, int level, boolean flag) {
        if(root== null){
             return;
        }
        if(level==1){
             System.out.print(root.data + " ");
        }
        else if(level>1){
            if(flag!= false){
                printGivenLevel(root.left,level-1,flag);
                printGivenLevel(root.right,level-1,flag);
            } else {
                printGivenLevel(root.right,level-1,flag);
                printGivenLevel(root.left,level-1,flag);
            }
        }  
     }
     int height(Node root) {
         if(root==null) {
             return 0;
         } else{
            return (Math.max(height(root.left), height(root.right))+1);
         }
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
        gt.printSpiral();
     }
}
