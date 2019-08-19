package part3.chapter12.section12_2;

import part3.chapter12.TreeNode;

public class TreeSuccessor {
    public static TreeNode treeSuccessor(TreeNode x){
        if(x.right != null){
            return TreeMinimum.treeMinimum(x);
        }

        TreeNode y = x.parent;
        while(y != null && x == y.right){
            x = y;
            y = y.parent;
        }

        return y;
    }
}
