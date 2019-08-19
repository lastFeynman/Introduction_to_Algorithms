package part3.chapter12.section12_3;

import part3.chapter12.TreeNode;

public class TreeInsert {
    public static TreeNode treeInsert(TreeNode root, int k){
        TreeNode y = null;
        TreeNode x = root;
        TreeNode z = new TreeNode(k);
        while(x != null){
            y = x;
            if(z.val < x.val)
                x = x.left;
            else
                x = x.right;
        }
        z.parent = y;
        if(y == null)
            root = z;
        else if(z.val < y.val)
            y.left = z;
        else
            y.right = z;
        return root;
    }
}
