public record CeilBST() {
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
    
    static class BinaryTree{
        static int idx = -1;
        public static Node BuildTree(int[] nodes){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = BuildTree(nodes);
            newNode.right = BuildTree(nodes);

            return newNode;
        }
    }

    public static int ceil(Node root, int key){
        int ceil = 0;
        while(root != null){
            if( root.data == key){
                ceil = root.data;
                return ceil;
            }
            if(key > root.data){
                root = root.right;
            }else{
                ceil = root.data;
                root = root.left;
            }
        }
        return ceil;
    }
    public static void main(String[] args) {
        int[] nodes = {10, 5, 3, 2, -1, -1, 4, -1, -1, 6, -1, 9, -1, -1, 13, 11, -1, -1, 14, -1, -1};

        BinaryTree tree = new BinaryTree();
        Node root = tree.BuildTree(nodes);
        System.out.println(root.data);

        int res = ceil(root, 8);
        System.out.println(res);
    }
}
