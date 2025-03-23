package BinaryTrees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InorderTraversalIterative {

    /*
                    (1)
               (2)         (3)
           (4)      (5)         (8)
                  (6)  (7)    (9)
     */

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
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            res.add(curr.val);
            curr = curr.right;
        }
        return res;
    }
}
