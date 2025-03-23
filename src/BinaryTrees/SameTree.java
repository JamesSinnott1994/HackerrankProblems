package BinaryTrees;

import java.util.Stack;

public class SameTree {

    public static void main(String[] args) {

        TreeNode twoTree1 = new TreeNode(2);
        TreeNode rootTree1 = new TreeNode(1, twoTree1, null);

        TreeNode twoTree2 = new TreeNode(2);
        TreeNode rootTree2 = new TreeNode(1, null, twoTree2);

        System.out.println(isSameTree(rootTree1, rootTree2));

    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {

        // 1. Base Case Handling: If both trees are empty, return true
        if (p == null && q == null) { return true; }

        // 2. Null Check: If one tree is empty while the other is not, return false
        if (p == null || q == null) { return false; }

        // 3. Value Comparison: Compares the values of the current
        // nodes in both trees.

        // 4. Recursive Calls: Recursively calls the function for left subtrees
        // and right subtrees.

        // 5. Return: Returns true if all conditions hold true, indicating
        // identical trees; otherwise, returns false.
        return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

}
