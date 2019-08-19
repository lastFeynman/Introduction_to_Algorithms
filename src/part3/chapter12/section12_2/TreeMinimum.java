package part3.chapter12.section12_2;

import part3.chapter12.TreeNode;

public class TreeMinimum {
    public static TreeNode treeMinimum(TreeNode root){
        if(root == null)
            return null;
        TreeNode p = root;
        while(p.left != null)
            p = p.left;
        return p;
    }
}
