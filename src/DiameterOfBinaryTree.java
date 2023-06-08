/*Given the root of a binary tree, return the length of the diameter of the tree.
The diameter of a binary tree is the length of the longest path between any two nodes in a tree.
This path may or may not pass through the root.
The length of a path between two nodes is represented by the number of edges between them.*/

public class DiameterOfBinaryTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        private int diameter;

        public int diameterOfBinaryTree(TreeNode root) {
          diameter = 0;
          calculateDiameterOfBinaryTree(root);
          return diameter;
        }

        private int calculateDiameterOfBinaryTree(TreeNode node){
            if(node == null){
                return 0;
            }

            int leftPath = calculateDiameterOfBinaryTree(node.left);
            int rightPath = calculateDiameterOfBinaryTree(node.right);

            diameter = Math.max(leftPath + rightPath, diameter);

            return Math.max(leftPath, rightPath) + 1;
        }
    }
}
