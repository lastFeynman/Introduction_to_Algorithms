package part3.chapter12.section12_2;

import part3.chapter12.TreeNode;

public class TreePredecessor {
    public static TreeNode treePredecessor(TreeNode x){
        if(x.left != null){
            return TreeMaximum.treeMaximum(x.left);
        }
        TreeNode y = x.parent;
        while(y != null && x == y.left){
            x = y;
            y = y.parent;
        }
        return y;
    }
}
