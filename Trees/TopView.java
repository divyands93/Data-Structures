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
    void TopView(){
       TopViewUtil(root);
    }
    
    void TopViewUtil(Node root) {
        class QueueObj {
            Node node;
            int hd;
            QueueObj(Node node, int hd) {
                this.node = node;
                this.hd = hd;
            }
        }
        Queue<QueueObj> q = new LinkedList<QueueObj>();
        Map<Integer, Node> treeMap = new TreeMap<Integer, Node>();
        if(root == null) {
            return;
        }
        q.add(new QueueObj(root, 0));
        while(!q.isEmpty()) {
            QueueObj tmp = q.poll();
            if(!treeMap.containsKey(tmp.hd)) {
                treeMap.put(tmp.hd, tmp.node);
            }
            if(tmp.node.left!= null){
                q.add(new QueueObj(tmp.node.left, tmp.hd-1));
            }
            if(tmp.node.right!= null){
                q.add(new QueueObj(tmp.node.right, tmp.hd+1));
            }
        }
        for(Entry<Integer, Node> entry : treeMap.entrySet()) {
            System.out.print(entry.getValue().data + " ");
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
        gt.TopView();
     }
}
