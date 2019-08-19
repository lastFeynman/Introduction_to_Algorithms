package part3.chapter12.section12_3;

import part3.chapter12.TreeNode;

public class Transplant {
    public static TreeNode transplant(TreeNode root, TreeNode u, TreeNode v){
        if(u.parent == null)
            return v;
        else if(u == u.parent.left){
            u.parent.left = v;
        }else{
            u.parent.right = v;
        }
        if(v != null)
            v.parent = u.parent;
        return root;
    }
}
