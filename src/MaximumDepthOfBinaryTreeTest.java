import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumDepthOfBinaryTreeTest {

    @Test
    public void checkMaximumDepthOfBinaryTreeTest(){
        MaximumDepthOfBinaryTree.TreeNode root =
                new MaximumDepthOfBinaryTree.TreeNode(
                        3,
                        new MaximumDepthOfBinaryTree.TreeNode(9),
                        new MaximumDepthOfBinaryTree.TreeNode(
                                20,
                                new MaximumDepthOfBinaryTree.TreeNode(15),
                                new MaximumDepthOfBinaryTree.TreeNode(7)
                        )
                );
        Assertions.assertEquals(3, new MaximumDepthOfBinaryTree().maxDepth(root));
    }
}
