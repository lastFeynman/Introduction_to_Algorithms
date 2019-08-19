package part3.chapter12.section12_1;

import part3.chapter12.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InorderTreeWalk {
    public static List<Integer> inorderTreeWalk(TreeNode root){
        List<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        List<Integer> left = inorderTreeWalk(root.left);
        list.addAll(left);
        list.add(root.val);
        List<Integer> right = inorderTreeWalk(root.right);
        list.addAll(right);
        return list;
    }

    public static List<Integer> inorderTreeWalkIterative(TreeNode root){
        List<Integer> list = new ArrayList<>();
        if(root == null) {
            return list;
        }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode p = root;
        while(true){
            if(p != null){
                stack.push(p);
                p = p.left;
            }else{
                if(stack.isEmpty())
                    break;
                p = stack.pop();
                list.add(p.val);
                p = p.right;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(6);
        TreeNode n1 = new TreeNode(5);
        TreeNode n2 = new TreeNode(7);
        TreeNode n3 = new TreeNode(2);
        TreeNode n4 = new TreeNode(5);
        TreeNode n5 = new TreeNode(8);

        root.left = n1;
        root.right = n2;

        n1.left = n3;
        n1.right = n4;
        n1.parent = root;

        n2.right = n5;
        n2.parent = root;

        n3.parent = n1;
        n4.parent = n1;

        n5.parent = n2;

        System.out.println(inorderTreeWalk(root));
    }
}
