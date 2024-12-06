//checking for max heap using binary tree

class Node{
    int data;
    Node left;
    Node right;
    Node(int d){
        this.data=d;
        this.left = this.left = null;
    }

}
public class BTreeheap {
    static boolean isHeap(Node root){
        if(root.left == null && root.right==null){
            return true;
        }
        if(root.right==null){
            return root.data>=root.left.data;
        }
        if(root.data>=root.left.data && root.data>=root.right.data){
            return isHeap(root.left) && isHeap(root.right);
        }
        else{
            return false;
        }
    }

    static boolean isComplete(Node root,int i, int count){
        if(root==null){
            return true;
        }
        if(i>=count){
            return false;
        }
        return isComplete(root.left, 2*i+1, count) && isComplete(root.right, 2*i+2, count);
    }

    static int countNode(Node root){
        if(root == null){
            return 0;
        }
        return 1 + countNode(root.left) + countNode(root.right);
    }

    static boolean check(Node root){
        int count = countNode(root);
        return isComplete(root,0,count) && isHeap(root); //pehle bulya taki left check krne wala case he khatam ho jaye ......  isComplete(root,0,count)    root, root ke default i ke value, count of node
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(6);
        root.left.left = new Node(1);
        root.left.right = new Node(4);
        root.right = new Node(8);
        root.right.left = new Node(7);
        root.right.right = new Node(2);

        System.out.println(check(root));

    }
}
