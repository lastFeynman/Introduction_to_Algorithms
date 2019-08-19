package part3.chapter12.section12_3;

import part3.chapter12.TreeNode;

public class Practice12_3_1 {
    public static TreeNode treeInsert(TreeNode root, TreeNode z){
        if(root == null)
            return z;
        insert(null, root, z);
        return root;
    }

    public static void insert(TreeNode p, TreeNode x, TreeNode z){
        if(x == null){
            z.parent = p;
            if(z.val < p.val)
                p.left = z;
            else
                p.right = z;
        }else if(z.val < x.val){
            insert(x, x.left, z);
        }else {
            insert(x, x.right, z);
        }
    }
}
