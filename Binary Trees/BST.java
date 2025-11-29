public class BST {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data > val){
            //left subtree
            root. left = insert(root.left, val);
        }else{
            root.right = insert(root.right, val);
        }

        return root;

    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static boolean search(Node root, int key){
        if(root == null){
            return false;
        }

        if(root.data > key){
            return search(root.left, key);
        }else if(root.data < key){
            return search(root.right, key);
        }else{
            return true;
        }
    }

    public static Node delete(Node root, int val){
        if(root.data > val){
            root.left = delete(root.left, val);
        }else if(root.data < val){
            root.right = delete(root.right, val);
        }else{//root.data == val
            //case 1: leaf node
            if(root.left == null && root.right == null){
                return null;
            }
    
            //case 2: if Node has only one child
            if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }
    
            //case 3: two children(inorder successor)
            Node IS = inOrderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data); // go to right subtree and delete the IS
        }
        return root;
    }
        

    public static Node inOrderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }

        return root;
    }


    public static void main(String[] args) {
        int[] values = {5, 1, 3, 4, 2, 7};
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        System.out.println("Inorder: ");
        inorder(root);
        System.out.println();
        
        if(search(root, 5)){
            System.out.println("key is found");
        }else{
            System.out.println("key is not found");
        }

        delete(root, 1);
        inorder(root);


    }
}
