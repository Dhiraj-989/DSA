public class Diameter {
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

    public static int height(Node root){
        if(root == null){
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        int myHeight = Math.max(leftHeight, rightHeight) + 1;
        return myHeight;
    }

    public static int diameterBrute(Node root){
        if(root == null){
            return 0;
        }

        int diam1 = diameterBrute(root.left);
        int diam2 = diameterBrute(root.right);
        int diam3 = height(root.left) + height(root.right) + 1;


        return Math.max(diam3, (Math.max(diam1, diam2)));
    }

    static class TreeInfo{
        int ht;
        int diam;

        TreeInfo(int ht, int diam){
            this.ht = ht;
            this.diam = diam;
        }
    }

    public static TreeInfo diameterOp(Node root){
        if(root == null){
            return new TreeInfo(0, 0);
        }

        TreeInfo left = diameterOp(root.left);
        TreeInfo right = diameterOp(root.right);

        int myHeight = Math.max(left.ht, right.ht) + 1;

        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.ht + right.ht + 1;

        int myDiam = Math.max(diam3, Math.max(diam1, diam2));

        TreeInfo myInfo = new TreeInfo(myHeight, myDiam);

        return myInfo;
    }
    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        BinaryTree tree = new BinaryTree();
        Node root = tree.BuildTree(nodes);

        System.out.println("Brute --> O(n^2): ");
        System.out.println(diameterBrute(root));
        System.out.println("Optimal --> O(n)");
        System.out.println(diameterOp(root).diam);
    }
}
