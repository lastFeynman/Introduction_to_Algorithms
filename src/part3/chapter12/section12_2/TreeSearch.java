package part3.chapter12.section12_2;

import part3.chapter12.TreeNode;

public class TreeSearch {
    public static TreeNode treeSearch(TreeNode root, int k){
        if(root == null || root.val == k)
            return root;
        if(k < root.val)
            return treeSearch(root.left, k);
        else
            return treeSearch(root.right, k);
    }

    public static TreeNode treeSearchIterative(TreeNode root, int k){
        TreeNode p = root;
        while(p != null && p.val != k){
            if(k < p.val)
                p = p.left;
            else
                p = p.right;
        }
        return p;
    }
}
