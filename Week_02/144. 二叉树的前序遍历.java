import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Stack;

/*
 * @lc app=leetcode.cn id=144 lang=java
 *
 * [144] 二叉树的前序遍历
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    // public List<Integer> preorderTraversal(TreeNode root) {

    //     List<Integer> ret = new ArrayList<>();
    //     visit(ret, root);

    //     return ret;
    // }

    // void visit(List<Integer> ret, TreeNode parent) {

    //     if (parent == null)
    //         return;

    //     ret.add(parent.val);
    //     visit(ret, parent.left);
    //     visit(ret, parent.right);
    // }

    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> ret = new ArrayList<>();

        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode parent = stack.pop();
            if (parent == null)
                continue;

            ret.add(parent.val);
            // 深度优先遍历用栈模拟需要跟节点遍历顺序相反!!
            stack.add(parent.right);
            stack.add(parent.left);
        }

        return ret;
    }

}
// @lc code=end

