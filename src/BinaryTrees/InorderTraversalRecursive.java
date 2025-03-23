package BinaryTrees;

import java.util.ArrayList;
import java.util.List;

public class InorderTraversalRecursive {

    public static void main(String[] args) {
        TreeNode six = new TreeNode(6);
        TreeNode seven = new TreeNode(7);
        TreeNode nine = new TreeNode(9);
        TreeNode eight = new TreeNode(8, nine, null);
        TreeNode five = new TreeNode(5, six, seven);
        TreeNode four = new TreeNode(4);
        TreeNode two = new TreeNode(2, four, five);
        TreeNode three = new TreeNode(3, null, eight);
        TreeNode root = new TreeNode(1, two, three);

        List<Integer> inorderNodesTraversed = inorderTraversal(root);
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        helper(root, res);
        return res;
    }

    public static void helper(TreeNode root, List<Integer> res) {
        if (root != null) {
            helper(root.left, res);
            res.add(root.val);
            helper(root.right, res);
        }
    }

}
