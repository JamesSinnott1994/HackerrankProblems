package BinaryTrees;

public class SymmetricTree {

    public static void main(String[] args) {

        TreeNode threeLeft = new TreeNode(3);
        TreeNode fourLeft = new TreeNode(4);
        TreeNode twoLeft = new TreeNode(2, threeLeft, fourLeft);

        TreeNode threeRight = new TreeNode(3);
        TreeNode fourRight = new TreeNode(4);
        TreeNode twoRight = new TreeNode(2, fourRight, threeRight);

        TreeNode root = new TreeNode(1, twoLeft, twoRight);
        System.out.println(isSymmetric(root));

    }

    public static boolean isSymmetric(TreeNode root) {
        return isMirror(root.left, root.right);
    }

    private static boolean isMirror(TreeNode n1, TreeNode n2) {
        if (n1 == null && n2 == null) { return true; }
        if (n1 == null || n2 == null) { return false; }
        return n1.val == n2.val && isMirror(n1.left, n2.right) && isMirror(n1.right, n2.left);
    }

}
