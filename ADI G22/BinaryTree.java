import java.util.HashMap;

class BinaryTree {
    
    static class Node {
        int data;
        Node left, right;

        Node(int value) {
            data = value;
            left = right = null;
        }
    }

    Node root;

    // In-order traversal (Left -> Root -> Right)
    void inorderTraversal(Node node) {
        if (node == null) return;
        inorderTraversal(node.left);
        System.out.print(node.data + " ");
        inorderTraversal(node.right);
    }

    // Pre-order traversal (Root -> Left -> Right)
    void preorderTraversal(Node node) {
        if (node == null) return;
        System.out.print(node.data + " ");
        preorderTraversal(node.left);
        preorderTraversal(node.right);
    }

    // Post-order traversal (Left -> Right -> Root)
    void postorderTraversal(Node node) {
        if (node == null) return;
        postorderTraversal(node.left);
        postorderTraversal(node.right);
        System.out.print(node.data + " ");
    }

   
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

       
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("In-order Traversal:");
        tree.inorderTraversal(tree.root);
        System.out.println();

        System.out.println("Pre-order Traversal:");
        tree.preorderTraversal(tree.root);
        System.out.println();

        System.out.println("Post-order Traversal:");
        tree.postorderTraversal(tree.root);
        System.out.println();
    }
}
static Node build(int in[],)

if(in==null || post==null || in.length!=post.length){
    return null;
}
HashMap<Integer, Integer> hm = new HashMap<>();
for(int i=0;i<in.length;i++){
    hm.put(in[i],i);
}

return build(in,0,in.length-1,post,0,post.length-1,hm);