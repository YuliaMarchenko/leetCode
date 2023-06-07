//Given the root of a binary tree, return the average value of the nodes on each level in the form of an array.
//Answers within 10-5 of the actual answer will be accepted.

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevelsInBinaryTree {
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
    }

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> avgs = new ArrayList<>();

        if (root == null){
            return avgs;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            int levelSize = queue.size();
            double levelSum = 0;

            for(int i = 0; i < levelSize; i++){
                TreeNode node = queue.remove();
                levelSum += node.val;

                if (node.left != null){
                    queue.add(node.left);
                }

                if (node.right != null){
                    queue.add(node.right);
                }
            }

            double levelAvg = levelSum / levelSize;
            avgs.add(levelAvg);
        }

        return avgs;
    }
}
