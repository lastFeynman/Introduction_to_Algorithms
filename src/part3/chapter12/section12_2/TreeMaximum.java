package part3.chapter12.section12_2;

import part3.chapter12.TreeNode;

public class TreeMaximum {
    public static TreeNode treeMaximum(TreeNode root){
        if(root == null)
            return null;

        TreeNode p = root;
        while(p.right != null)
            p = p.right;
        return p;
    }
}
