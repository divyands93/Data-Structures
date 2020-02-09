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

class Res {
    public int val;
}
public class Tree {
    Node root;
    Tree(){
        root= null;
    }
    int findMaxUtil(Node root, Res res) {
        if(root == null) {
            return 0;
        }
        int l = findMaxUtil(root.left, res);
        int r =  findMaxUtil(root.right, res);
        int max_single = Math.max(Math.max(l,r)+root.data, root.data);
        int max_top = Math.max(max_single, l+r+root.data);
        res.val = Math.max(res.val, max_top);
        return max_single;
    }
    int findMaxSum(){
        return findMaxSum(root);
    }
    
    int findMaxSum(Node root) {
        Res res = new Res();
        res.val = Integer.MIN_VALUE;
        findMaxUtil(root, res);
        return res.val;
    }
    public static void main(String args[]) {
        int arr[] = {16, 17, 4, 3, 5, 2};
        Tree tree = new Tree();
        tree.root = new Node(10); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(10); 
        tree.root.left.left = new Node(20); 
        tree.root.left.right = new Node(1); 
        tree.root.right.right = new Node(-25); 
        tree.root.right.right.left = new Node(3); 
        tree.root.right.right.right = new Node(4); 
        System.out.println(tree.findMaxSum());
    }
}
