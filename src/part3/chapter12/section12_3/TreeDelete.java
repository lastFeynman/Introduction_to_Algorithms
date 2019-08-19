package part3.chapter12.section12_3;

import part3.chapter12.TreeNode;
import part3.chapter12.section12_2.TreeMinimum;

public class TreeDelete {
    public static TreeNode treeDelete(TreeNode root, TreeNode z){
        if(z.left == null){
            return Transplant.transplant(root, z, z.right);
        }else if(z.right == null){
            return Transplant.transplant(root, z, z.left);
        }else{
            TreeNode y = TreeMinimum.treeMinimum(z.right);
            if(y.parent != z){
                root = Transplant.transplant(root, y, y.right);
                y.right = z.right;
                y.right.parent = y;
            }
            root = Transplant.transplant(root, z, y);
            y.left = z.left;
            y.left.parent = y;
        }
        return root;
    }
}
