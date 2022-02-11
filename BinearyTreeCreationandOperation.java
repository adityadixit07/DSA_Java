class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data) {
        this.data = data;
    }
}

public class BinearyTreeCreationandOperation {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(15);
        // System.out.print(root.data+" "+root.left+" "+root.right);
        TreeNode node1 = new TreeNode(13);
        TreeNode node2 = new TreeNode(14);
        TreeNode node3 = new TreeNode(18);
        root.left = node1;
        node1.right = node2;
        root.right = node3;
       
        
        printBST(root);
        Inorder(root);
        preorder(root);
        postorder(root);

    }

    public static void printBST(TreeNode root) {

        System.out.println(root.data);
        printBST(root.left);
        printBST(root.right);

    }

  public static  void Inorder(TreeNode root) {
        TreeNode temp = root;
        if (temp != null) {
            Inorder(temp.left);
            System.out.println(temp.data);
            Inorder(temp.right);

        }
    }

    public static  void preorder(TreeNode root) {
        TreeNode temp = root;
        if (temp != null) {

            System.out.println(temp.data);
            Inorder(temp.left);
            Inorder(temp.right);

        }
    }

    public static void postorder(TreeNode root) {
        TreeNode temp = root;
        if (temp != null) {
            Inorder(temp.left);
            Inorder(temp.right);
            System.out.println(temp.data);

        }
    }

}
